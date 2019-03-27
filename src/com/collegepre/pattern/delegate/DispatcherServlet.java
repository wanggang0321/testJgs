package com.collegepre.pattern.delegate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	
	public void doDispatcher(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uri = request.getRequestURI();
		if(uri.indexOf("getOrderById")>-1) {
			new OrderController().getOrderById(request, response);
		} else if(uri.indexOf("logout")>-1) {
			new SystemController().logout(request, response);
		} else {
			response.getWriter().write("404, the request url is not found!");
		}
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doDispatcher(request, response);
	}
	
}
