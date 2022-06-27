package com.example.demo.Configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.Formatters.AccountNumberFormatter;
import com.example.demo.Formatters.IfscCodeFormatter;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

	@Override
	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new AccountNumberFormatter());
		registry.addFormatter(new IfscCodeFormatter());

	}

}
