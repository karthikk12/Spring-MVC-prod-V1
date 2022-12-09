package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.Formatters.CardDetailsFormatter;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

	@Override
	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new CardDetailsFormatter());
		
		System.out.println("Registry Process Done...");
	}

}
