package com.assessment.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.inMemoryAuthentication().withUser("student").password("{noop}student123")
				.roles("STUDENT").and().withUser("author").password("{noop}author123").roles("AUTHOR").and().withUser("admin")
				.password("{noop}admin123").roles("ADMIN");
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers("/studentlogin").hasRole("STUDENT")
				.antMatchers("/authorlogin").hasRole("AUTHOR").antMatchers("/adminlogin").hasRole("ADMIN").and().csrf()
				.disable().headers().frameOptions().disable();
	}
}
