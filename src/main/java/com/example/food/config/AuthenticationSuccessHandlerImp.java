//package com.example.food.config;
//
//import lombok.val;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//// Xác thực thành công người xử lý
//public class AuthenticationSuccessHandlerImp implements AuthenticationSuccessHandler {
//    @Autowired
//    private JWTToken tokenProvider;
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//                                        Authentication authentication) throws IOException, ServletException {
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        val userDetails = (UserDetails) authentication.getPrincipal();
//
//        String jwt = String.format("{ \"token\" : \"%s\", \"expire\" : \"%d\"}",
//                tokenProvider.generateToken(userDetails), tokenProvider.getTimeExpireToken());
//        response.setStatus(HttpStatus.OK.value());
//        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
//        response.getWriter().write(jwt);
//        response.getWriter().flush();
//    }
//}
