package com.climber.climber;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        config.setAllowedOrigins(Arrays.asList("http://localhost:3000"));  // 허용할 Origin 설정
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));  // 허용할 메소드 설정
        config.setAllowedHeaders(Arrays.asList("*"));  // 허용할 헤더 설정
        config.setAllowCredentials(true);  // 자격 증명 허용 (예: 쿠키)

        source.registerCorsConfiguration("/**", config);  // 모든 경로에 대해 CORS 설정 적용

        return new CorsFilter(source);
    }
}
