package com.example.food.repository;

import com.example.food.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends  JpaRepository<User, String>{
    @Query("select user from User user")
    List<User> getAll();
    @Query("select user from User user where user.id = :id")
    User getById(String id);

    @Query(value = "select count(*) from  food.user",nativeQuery = true)
    Long countUser();


//    @Query("insert into user (name)  values (name)")
//    User save(String name);

    }
