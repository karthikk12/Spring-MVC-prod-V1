package com.demo.Configurations;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class MySecurityEnabler extends WebSecurityConfigurerAdapter {

	@Autowired
	public PasswordEncoder encoder;

	@Autowired
	public DataSource datasource;

	@Override
	protected void configure(AuthenticationManagerBuilder authenticator) throws Exception {

//		authenticator.inMemoryAuthentication().withUser("Karthik").password(getEncodeValue("Code")).roles("admin").and()
//				.withUser("Shibi").password(getEncodeValue("Travel")).roles("admin");

		authenticator.jdbcAuthentication().dataSource(datasource).passwordEncoder(encoder);

		System.out.println(encoder.encode("Balaji"));

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests().antMatchers("/welcome").authenticated().antMatchers("/admin").authenticated()
				.antMatchers("/bye").permitAll().and().formLogin().loginPage("/loginPage").and().httpBasic();

	}

	public String getEncodeValue(String password) {

		return encoder.encode(password);
	}

}
