package com.example.demo.Configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.Formatters.AadhaarCardFormatter;
import com.example.demo.Formatters.AccountNumberFormatter;
import com.example.demo.Formatters.IfscCodeFormatter;
import com.example.demo.Formatters.PanCardFormatter;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

	@Override
	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new AccountNumberFormatter());
		registry.addFormatter(new IfscCodeFormatter());
		registry.addFormatter(new AadhaarCardFormatter());
		registry.addFormatter(new PanCardFormatter());
		System.out.println("register End.....");

	}

}
