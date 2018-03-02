package com.vivek.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.vivek.app.service.MyDBAuthenticationService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	MyDBAuthenticationService dBauthenticationService;
	
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(dBauthenticationService);
	}
	
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable();
		
		//Below pages requires login as Employee or Manager
		http.authorizeRequests().antMatchers("/orderList","/order","/accountInfo")
		.access("hasAnyRole('ROLE_EMPLOYEE','ROLE_MANAGER')");
		
		http.authorizeRequests().antMatchers("/product").access("hasRole('ROLE_MANAGER')");
		
		//AccessDeniedExceptin will thow
		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
		
		
		//Config for Login Form
		http.authorizeRequests().and().formLogin()
		.loginProcessingUrl("/securityCheck").loginPage("/login")
		.defaultSuccessUrl("/accountInfo").failureUrl("/login?error=true")
		.usernameParameter("userName").passwordParameter("password").and().logout().logoutUrl("/logout").logoutSuccessUrl("/");
		
	}

}
