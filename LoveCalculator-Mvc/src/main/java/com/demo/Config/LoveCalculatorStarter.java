package com.demo.Config;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveCalculatorStarter extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] arr = { LoveCalculatorConfig.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() {

		String arr[] = { "/love.com/*" };
		return arr;
	}

}
