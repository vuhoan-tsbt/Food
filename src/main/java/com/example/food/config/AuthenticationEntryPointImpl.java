//package com.example.food.config;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//// lối vào xác thực
//public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
//    @Override
//    public void commence(HttpServletRequest request, HttpServletResponse response,
//                         AuthenticationException authException) throws IOException {
//        response.setStatus(HttpStatus.UNAUTHORIZED.value());
//        response.setContentType(MediaType.TEXT_PLAIN_VALUE);
//        response.getWriter().write("Please login");
//        response.getWriter().flush();
//    }
//}
