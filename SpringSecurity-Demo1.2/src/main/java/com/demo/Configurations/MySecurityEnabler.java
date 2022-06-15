package com.demo.Configurations;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

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

//		authenticator.jdbcAuthentication().dataSource(datasource).passwordEncoder(encoder);
//
//		System.out.println(encoder.encode("Balaji"));

		UserDetails shibiUser = User.withUsername("Shibi").password("shibi123").roles("demo").build();

		UserDetails Naveen = User.withUsername("Naveen").password("naveen123").roles("demo").build();

		InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();

		userDetailsManager.createUser(Naveen);
		userDetailsManager.createUser(shibiUser);

		authenticator.userDetailsService(userDetailsManager);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/demo.security/coderPage").hasAuthority("demo")
				.antMatchers("/demo.security/testerPage").hasAuthority("demo").and().httpBasic().and().formLogin();
	}

	public String getEncodeValue(String password) {

		return encoder.encode(password);
	}

}
