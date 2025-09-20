package com.tagoapp.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        // 現時点では全ての /api/v1/** へのリクエストを許可する
                        .requestMatchers("/api/v1/**").permitAll()
                        .anyRequest().authenticated())
                // REST APIなのでCSRFは不要
                .csrf(csrf -> csrf.disable())
                .httpBasic(withDefaults());
        return http.build();
    }
}
