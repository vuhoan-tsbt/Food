//package com.example.food.service.Repository;
//
//import com.example.food.Entity.User;
//import com.example.food.exception.DataNotFoundException;
//import com.example.food.service.DTO.UserDTO;
//import com.example.food.service.map.UserModel;
//import lombok.val;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.awt.*;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Repository
//public class UserRepository {
//
//    @Autowired
//    private UserModel userModel;
//
//    public Optional<User> findUserAccount(String name) {
//        return userModel.findUserAccount(name);
//    }
//
//    public List<UserDTO> findAllUser() {
//
//        return userModel.findAllUser().stream().map(user -> new UserDTO(user)).collect(Collectors.toList());
//    }
//
//    public UserDTO findById(String id) {
//        val user = userModel.findById(id)
//                .orElseThrow(() -> new DataNotFoundException("Not found user : " + id));
//        return new UserDTO(user);
//    }
//    public String save(User user) {
//        return userModel.save(user);
//    }
//}
