package com.demo.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AssistStarter extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] arr = { AssistConfig.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() {

		String arr[] = { "/assist.com/*" };
		return arr;
	}

}
