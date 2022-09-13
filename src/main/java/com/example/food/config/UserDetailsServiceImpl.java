//package com.example.food.config;
//
//import com.example.food.Entity.User;
//import com.example.food.service.UserRoleService;
//import com.example.food.service.UserService;
//import lombok.val;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    UserService userService;
//    @Autowired
//    UserRoleService userRoleService;
//
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//        Optional<User> user = userService.findUserAccount(username);
//        if(!user.isPresent()){
//            throw  new UsernameNotFoundException(String.format("User %s was not found in the database",username));
//
//
//        }
//        val users = user.get();
//        List<GrantedAuthority> grants = userRoleService.getRoleNames(users.getId()).stream()
//                .map(SimpleGrantedAuthority::new).collect(Collectors.toList());
//
//        UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails
//                .User(users.getUsername(),users.getPassword(),grants);
//
//        return userDetails;
//    }
//
//
//}
