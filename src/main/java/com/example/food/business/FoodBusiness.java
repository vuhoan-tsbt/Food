package com.example.food.business;
import com.example.food.Entity.User;
import com.example.food.model.IdResponse;
import com.example.food.model.RegisterRequest;
import com.example.food.model.UserRequest;
import com.example.food.model.UserResponse;
//import com.example.food.repository.UserRepository;
import com.example.food.repository.UserRepository;
import com.example.food.response.BaseResponse;
//import com.github.dozermapper.core.Mapper;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class FoodBusiness {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    UserService userService;


//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    public IdResponse Register(RegisterRequest input) {
//
//        IdResponse idResponse = new IdResponse();
//        input.setPassword(passwordEncoder.encode(input.getPassword()));
//        val user = modelMapper.map(input, User.class);
//        String id= userService.save(user);
//        idResponse.setId(id);
//        return idResponse;
//
//    }

//    @Autowired
//    private UserRepository userRepository;
////    @Autowired
////    private Mapper mapper;
////    @Autowired
////    private Mapper mapper;
//
//    public String setNumbers(long number) {
//        int count = 0;
//        long num = number;
//        while (num > 0) {
//            num /= 10;
//            count++;
//        }
//        String out = "";
//        while (6 - count > 0) {
//            out = out + "0";
//            count++;
//        }
//        return out + number;
//    }
//
//
//
    public List<UserResponse> ListUser() {
        return userRepository.getAll().stream().map(item -> new UserResponse()
                .setId(item.getId())
                .setName(item.getName())
        ).collect(Collectors.toList());
    }
    @Transactional
    public IdResponse CreateUser(UserRequest input) {
        long number = userRepository.countUser() +1;
        User user = new User();
        user.setName(input.getName());
        //user.setId("1");
        userRepository.save(user);

        IdResponse idResponse = new IdResponse();
        idResponse.setId(user.getId());
        return idResponse;


    }
}
