package edu.lahiru.blood_donation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Collections;
import java.util.List;

@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http){
        JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(new KeycloakRoleConverter());
        http.cors(corsConfigurer ->
            corsConfigurer.configurationSource(request -> {
                CorsConfiguration corsConfiguration = new CorsConfiguration();
                corsConfiguration.setAllowedOrigins(
                        Collections.singletonList("http://localhost:3000")
                );
                corsConfiguration.setAllowedHeaders(Collections.singletonList("*"));
                corsConfiguration.setAllowedMethods(Collections.singletonList("*"));
                corsConfiguration.setAllowCredentials(true);
                corsConfiguration.setMaxAge(3600L);
                corsConfiguration.setExposedHeaders(List.of("Authorization"));
                return corsConfiguration;
            }))
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(requests-> requests.anyRequest().authenticated());

        http.oauth2ResourceServer(resourceServerConfig -> resourceServerConfig.jwt(
                jwtConfigurer -> jwtConfigurer.jwtAuthenticationConverter(
                        jwtAuthenticationConverter)));

        return http.build();
    }

}
