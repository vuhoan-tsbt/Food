//package com.example.food.config;
//
//import com.example.food.Entity.User;
//import com.example.food.service.Repository.UserRoleRepository;
//import com.example.food.service.UserRoleService;
//import com.example.food.service.UserService;
//import lombok.val;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Component
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//    @Autowired
//    JWTToken jwtToken;
//    @Autowired
//    UserService userService;
//
//    @Autowired
//    UserRoleService userRoleService;
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//        String jwt = getJwtFromRequest(request);
//        if(jwt != null && jwtToken.validateToken(jwt)){
//            String username = jwtToken.getUserNameFromJWT(jwt);
//            Optional<User> user = userService.findUserAccount(username);
//            if(user.isPresent()){
//                val users = user.get();
//
//                List<GrantedAuthority> grants = userRoleService.getRoleNames(users.getId()).stream()
//                        .map(SimpleGrantedAuthority::new).collect(Collectors.toList());
//                UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails
//                .User(users.getUsername(),users.getPassword(),grants);
//                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//            }
//        }
//        filterChain.doFilter(request,response);
//
//
//    }
//    public String getJwtFromRequest(HttpServletRequest request) {
//        return request.getHeader("Authorization");
//    }
//
//
//}
