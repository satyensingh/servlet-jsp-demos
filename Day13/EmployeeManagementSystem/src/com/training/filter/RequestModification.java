package com.training.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import com.sun.org.apache.bcel.internal.generic.SALOAD;

public class RequestModification implements Filter {

	static class FilteredRequest extends HttpServletRequestWrapper {

		public FilteredRequest(HttpServletRequest request) {
			super(request);
		}

		@Override
		public String getParameter(String name) {
			super.getParameter(name);
			double salary = 0.0;
			System.out.println(name);
			if (name.equals("salary")) {
				salary = Double.parseDouble(super.getParameter(name));
				salary = salary + 100;
				return ""+salary;
			}
			return "";
		}

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		FilteredRequest filteredRequest = new FilteredRequest((HttpServletRequest)request);
		chain.doFilter(filteredRequest, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
