package org.example.securitydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Disable CSRF for simplicity (only for demo purposes)
                .csrf(csrf -> csrf.disable())

                // Enable CORS with default settings
                .cors(Customizer.withDefaults())

                // Configure URL authorization rules
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/public/**").permitAll()  // public pages
                        .requestMatchers("/admin/**").hasRole("ADMIN") // only ADMIN role
                        .anyRequest().authenticated() // all other pages require login
                )

                // Enable form login
                .formLogin(Customizer.withDefaults())

                // Enable HTTP Basic authentication
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}
