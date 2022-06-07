package com.demo.Configurations;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MyAppInistialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] configClass = { MyAppConfig.class };

		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		
		String [] mappings= {"/demo.security/*"};
		
		return mappings;
	}

}
