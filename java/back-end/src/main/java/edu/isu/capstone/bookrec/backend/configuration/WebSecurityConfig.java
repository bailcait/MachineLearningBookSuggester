package edu.isu.capstone.bookrec.backend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and().authorizeRequests()
                .antMatchers("/resources/**", "/css/**", "/js/**")
                    .permitAll()
                .antMatchers("/**")
                    .permitAll()
                .anyRequest()
                    .authenticated()
                .and().csrf()
                    .disable().headers().frameOptions().disable()
                .and().sessionManagement()
                    .maximumSessions(1)
                    .maxSessionsPreventsLogin(true);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        throw new NotImplementedException();
    }

    @Bean
    public AuthenticationSuccessHandler authenticationSuccessHandler() {
        throw new NotImplementedException();
    }
}