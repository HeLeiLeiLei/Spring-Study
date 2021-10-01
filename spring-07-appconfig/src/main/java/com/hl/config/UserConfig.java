package com.hl.config;

import com.hl.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hl.pojo")
public class UserConfig {

//    @Bean
//    public User user(){
//        return new User();
//    }
}
