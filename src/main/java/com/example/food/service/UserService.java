//package com.example.food.service;
//
//import com.example.food.Entity.User;
//import com.example.food.service.DTO.UserDTO;
//import com.example.food.service.Repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.Assert;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserService extends BaseTransactionalService{
//    @Autowired
//    private UserRepository repository;
//
//    public Optional<User> findUserAccount(String name) {
//        return repository.findUserAccount(name);
//    }
//
//    public List<UserDTO> findAllUser() {
//        return repository.findAllUser();
//    }
//
//    public UserDTO findById(String id) {
//        Assert.notNull(id, "userId must not be null");
//        return repository.findById(id);
//    }
//    public String save(User user) {
//        return repository.save(user);
//    }
//}
