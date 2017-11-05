package edu.sjsu.openstack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.sjsu.openstack.util.OpenStackUtil;

public class MainServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	/**
	 * Servlet doGet method
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		OpenStackUtil helper = new OpenStackUtil();
		helper.start();
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
		requestDispatcher.forward(request, response);
	}
}
