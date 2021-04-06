package com.mrc.yg.api.framework.jwt;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// import 생략

public class JwtAuthenticationFilter extends GenericFilterBean {


    private JwtTokenProvider jwtTokenProvider;


    // Jwt Provier 주입
    public JwtAuthenticationFilter(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;

    }

    // Request로 들어오는 Jwt Token의 유효성을 검증(jwtTokenProvider.validateToken)하는 filter를 filterChain에 등록합니다.
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        String token = jwtTokenProvider.resolveToken((HttpServletRequest) request);
        if (token != null && jwtTokenProvider.validateToken(token)) {


            //Claims claims = Jwts.parser().setSigningKey(jwtTokenProvider.getSecretKey()).parseClaimsJws(token.trim()).getBody();

            // Authentication auth = jwtTokenProvider.getAuthentication(token);
            Authentication auth = this.getAuthentication(token);
            SecurityContextHolder.getContext().setAuthentication(auth);
        }
        filterChain.doFilter(request, response);
    }


    private Authentication getAuthentication(String token){
       // String token = request.getHeader("Authorization");
        Claims claims = Jwts.parser().setSigningKey(jwtTokenProvider.getSecretKey()).parseClaimsJws(token.trim()).getBody();
        return new UsernamePasswordAuthenticationToken(claims, "",makeAuthorities());
    }

    private List<GrantedAuthority> makeAuthorities(){
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return authorities;
    }

}