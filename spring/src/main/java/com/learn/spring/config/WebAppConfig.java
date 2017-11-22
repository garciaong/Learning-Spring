package com.learn.spring.config;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	private static final Logger log = Logger.getLogger(WebAppConfig.class);
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Adding AppConfig class to dispatcher servlet...");
		return new Class[] { AppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
//		return new Class[] { AppConfig.class };
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}