package com.cdac.pages;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * Servlet implementation class Servlet1
 */
/*
 * @WebServlet - class level, run time annotation (=wc) this annotation will be
 * read by WC, only once at the web app deplyment time Meaning - to tell WC,
 * create a mapping between incoming url servlet URL ->
 * http://host:port/day_2_lab/test1 url pattern : /test1 WC creates a map key:-
 * /test1 value:- fully qualified servlet class name (eg -
 * com.cdac.pages.Servlet1)
 */
@WebServlet("/test1")			// there is another option as well in .xml
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see Servlet#init(ServletConfig)  
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("in init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in destroy");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in doGet");
		// dev steps 1. set content type
		response.setContentType("text/html");
		// 2. set dynamic response -of text type
		/*
		 * API of ServletResponse i/f (super i/f of HttpServletResponse) public
		 * PrintWriter getWriter() throws IOException
		 */
		try (PrintWriter pw = response.getWriter()) {
			// 3. send the response - simply uses print method
			pw.print("<h4>Hello form Servlet1 at" + LocalDateTime.now() + "<h4>");
		}
	}

}
