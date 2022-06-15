package com.demo.Configurations;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.demo.Configurations", "com.demo.Controllers", "com.demo.DAO", "com.demo.Service",
		"com.demo.Exceptions" })
public class MyAppConfig {

	@Bean
	public InternalResourceViewResolver getViewResolver() {

		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return resolver;

	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {

		return NoOpPasswordEncoder.getInstance();

	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {

		return new JdbcTemplate(getDataSource());
	}

	@Bean
	public DataSource getDataSource() {

		String url = "jdbc:mysql://localhost:3306/security1";
		String userName = "root";
		String password = "root";

		DriverManagerDataSource datasource = new DriverManagerDataSource(url, userName, password);

		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");

		return datasource;

	}

}
