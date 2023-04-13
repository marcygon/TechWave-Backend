package com.techevents.app.security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

  private final JwtAuthenticationFilter jwtAuthFilter;
  private final AuthenticationProvider authenticationProvider;
  private final LogoutHandler logoutHandler;

  @Bean


  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
      http
              .csrf().and().cors()
              .disable()
              .authorizeHttpRequests(auth -> auth
                      .requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")).permitAll()
              ).headers(headers -> headers.frameOptions().disable())
              .csrf(csrf -> csrf
                      .ignoringRequestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")))
              .csrf()
              .ignoringRequestMatchers(toH2Console())
              .disable()
              .authorizeHttpRequests()
              .requestMatchers("/events/auth/**", "/**")
              .permitAll()

              .requestMatchers(new AntPathRequestMatcher("/h2-console/**"))
              .permitAll()

              .anyRequest()
              .authenticated()
              .and()
              .sessionManagement()
              .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
              .and()
              .authenticationProvider(authenticationProvider)
              .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
              .logout()
              .logoutUrl("/events/auth/logout")
              .addLogoutHandler(logoutHandler)
              .logoutSuccessHandler((request, response, authentication) -> SecurityContextHolder.clearContext())
      ;

      http.headers().frameOptions().disable();


    return http.build();
  }
}
