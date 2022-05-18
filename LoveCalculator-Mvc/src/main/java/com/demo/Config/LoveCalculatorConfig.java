package com.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.demo.formatters.CreditCardBalanceFromatter;
import com.demo.formatters.CreditCardNumberFormatter;
import com.demo.formatters.ElectricFormatter;
import com.demo.formatters.LandlineFormatter;
import com.demo.formatters.PhoneNoFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.demo.controllers,com.demo.Prepopulate,com.demo.DTO")
public class LoveCalculatorConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver bean() {

		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return resolver;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {

		System.out.println("instance of phone Number formatter");

		registry.addFormatter(new PhoneNoFormatter());

		registry.addFormatter(new LandlineFormatter());

		registry.addFormatter(new CreditCardNumberFormatter());

		registry.addFormatter(new CreditCardBalanceFromatter());

		registry.addFormatter(new ElectricFormatter());

	}
}
