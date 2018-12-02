package com.claymore.bamder.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author li.zhuo
 * @create 2018/10/26 下午11:32
 * @since 1.0.0
 */
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // disable csrf
        http.csrf().disable();

        // @formatter:off
        http
                .cors()
                .and()
                .antMatcher("/**")
                .authorizeRequests().antMatchers("/**").permitAll();
        // @formatter:on
    }

}
