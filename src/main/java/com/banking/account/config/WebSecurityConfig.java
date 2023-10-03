package com.banking.account.config;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://banking-angular-920510b7cbf3.herokuapp.com")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorizeRequests -> {
                    authorizeRequests
                            .antMatchers("/public/**").permitAll()
                            .anyRequest().authenticated();
                })
                .formLogin()
                .disable()
                .logout(logout -> {
                    logout
                            .logoutSuccessUrl("/login?logout")
                            .permitAll();
                })
                .cors();
    }
}
