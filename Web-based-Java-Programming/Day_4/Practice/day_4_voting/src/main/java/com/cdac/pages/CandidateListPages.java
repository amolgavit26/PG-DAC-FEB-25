package com.cdac.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.List;

import com.cdac.dao.CandidateDaoImpl;
import com.cdac.pojos.Candidate;
import com.cdac.pojos.User;

/**
 * Servlet implementation class AdminPage
 */
@WebServlet("/candidate_list")
public class CandidateListPages extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletReq uest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("in candidate list page.<br>");

			// 1. get HttpSession from WC
			HttpSession hs = request.getSession();
			System.out.println("session id from list " + hs.getId());
			System.out.println("session is new from list " + hs.isNew());

			// 2. get data from HttpSession
			User userDetails = (User) hs.getAttribute("user_info");
			if (userDetails != null) {

				// existing session
				CandidateDaoImpl dao = (CandidateDaoImpl) hs.getAttribute("candidate_dao");

				pw.print("<h5>User Hello " + userDetails.getFirstName() + userDetails.getLastName() + "</h5>");

				// invoke dao's method
				List<Candidate> allCandidates = dao.getAllCandidates();
				// pw.print(allCandidates);
				// dynamic form generation n rendering
				pw.print("<form method='post' action='logout'>");
				for (Candidate c : allCandidates) {
					pw.print("<h5><input type='radio' " + "name='candidateId' value='" + c.getCandidateId() + "' />"
							+ c.getName() + "</h5>");
				}
				// <input type submit- to vote
				pw.print("<h5><input type='submit' value='Vote'/></h5>");
				pw.print("</form>");

			} else { // => no cookies
				pw.print("<h5>No Cookies Session tracking failed</h5>");
			}
//			pw.print("user email  " + request.getParameter("em"));
		} catch (Exception e) {
			throw new ServletException("err in doPost. e");
		}
	}

}
