package org.xulinux.spring5.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/3/13 下午5:42
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {



//   内存
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("akaakking")
//                    .password("123456")
//                    .authorities("ROLE_USER")
//                .and()
//                .withUser("rtr")
//                    .password("43214")
//                    .authorities("ROLE_USER");
//    }
}
