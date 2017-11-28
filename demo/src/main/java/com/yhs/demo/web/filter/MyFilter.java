package com.yhs.demo.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse,
			FilterChain paramFilterChain) throws IOException, ServletException {
		System.out.println("execute filter !!!");
		paramFilterChain.doFilter(paramServletRequest, paramServletResponse);
	}

	@Override
	public void init(FilterConfig paramFilterConfig) throws ServletException {
		System.out.println("do init !!!");
	}

}
