package com.cdac.pages;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import com.cdac.dao.CandidateDaoImpl;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

import static com.cdac.utils.DBUtils.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(value = "/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDaoImpl userDao;
	private CandidateDaoImpl candidateDao;

	/**
	 * @see Servlet#init()
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("in init");
		try {
			// open cn and create the dao instance
			openConnection();

			// create dao instance
			userDao = new UserDaoImpl();
			candidateDao = new CandidateDaoImpl();

		} catch (Exception e) {
			System.out.println(e);
			/*
			 * centralized exception handdling in servlet
			 */
			throw new ServletException("err in int", e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println(" in destroy");
		try {
			// dao - clean up, close cn
			userDao.cleanUp();
			candidateDao.cleanUp();
			closeConnection();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// set const type, read request data, invoke dao's method - signin
		// 1 set cont type
		response.setContentType("text/html");

		// 2 Get Write(pw) to send the text response
		try (PrintWriter pw = response.getWriter()) {
			// 3. read request parameters - em, pass
			String email = request.getParameter("em");
			String password = request.getParameter("pass");

			// 4. login servlet -> user dao's method
			User user = userDao.signIn(email, password);

			// 5. null checking
			if (user == null) {
				// => invalid login
				pw.print("<h5>Invalid Login, please <a href='login.html'>Retry</a><h5>");
			} else {
				// => Valid Login

				// 6. getHttpSession from WC
				HttpSession session = request.getSession();
				System.out.println("session id from Login " + session.getId());
				System.out.println("session is new from Login " + session.isNew());
				// 7. add the user info to the session scope
				session.setAttribute("user_info", user);
				
				// 7.5 store dao instance under session scope
				session.setAttribute("user_dao", userDao);
				session.setAttribute("candidate_dao", candidateDao);

				// pw.print("<h5>login Scuccessful, Your Details" + user +"<h5>");

				// role base authorization
				if (user.getUserRole().equals("admin")) {
					response.sendRedirect("admin_dashboard");
				} else {
					// voter login
					if (user.isStatus()) {
						response.sendRedirect("logout");
					} else { // voter not yet voted
						response.sendRedirect("candidate_list");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);

			throw new ServletException("error in doPost", e);
		}
	}

}
