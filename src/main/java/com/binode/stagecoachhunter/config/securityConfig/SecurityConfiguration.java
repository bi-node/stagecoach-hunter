package com.binode.stagecoachhunter.config.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity

public class SecurityConfiguration {
    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final AuthenticationProvider authenticationProvider;

    public SecurityConfiguration(JwtAuthenticationFilter jwtAuthenticationFilter, AuthenticationProvider authenticationProvider) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
        this.authenticationProvider = authenticationProvider;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable) // Disable CSRF as JWTs are used (stateless)

                .authorizeHttpRequests(authorizeRequests -> authorizeRequests
                        //Make every end points open
                                .anyRequest().permitAll()

                        //to check security comment out all of these below
//                        .requestMatchers("/api/v1/auth/**").permitAll()
//                        .requestMatchers("/api/v1/admin/**").hasAuthority("ROLE_ADMIN")
//                        .requestMatchers("/api/v1/user/**").hasAuthority("ROLE_USER")
//                        .requestMatchers("/api/v1/**").permitAll()

//                        .requestMatchers("/api/v1/airports/**").permitAll()
//
//                        // Any other request must be authenticated
//                        .anyRequest().authenticated()
                )
                .cors(withDefaults())

                .sessionManagement(sessionManagement -> sessionManagement
                        // Configure session management to be stateless
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )

                // Set the custom authentication provider
                .authenticationProvider(authenticationProvider)

                // Add the custom JWT authentication filter before the default UsernamePasswordAuthenticationFilter
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build(); // Build and return the SecurityFilterChain
    }
}
