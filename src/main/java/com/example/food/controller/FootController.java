package com.example.food.controller;


import java.util.LinkedList;
import java.util.List;


import com.example.food.business.FoodBusiness;
import com.example.food.model.IdResponse;
import com.example.food.model.RegisterRequest;
import com.example.food.model.UserRequest;
import com.example.food.model.UserResponse;
import com.example.food.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;





@RestController
public class FootController {
    @Autowired
     private FoodBusiness foodBusiness;

//	@GetMapping("/")
//	public Map<String, Object> getList() {
//		/*RootResponse root =new RootResponse();
//		root.setCode(200);
//		List<FoodDTO> listData = new LinkedList<>();
//		listData.add(new FoodDTO());
//		listData.add(new FoodDTO());
//		listData.add(new FoodDTO());
//		root.setBody(ListFoodResponse.builder().listData(listData).build());
//		return root;*/
//		List<FoodDTO> listData = null;
//		listData.add(new FoodDTO());
//		listData.add(new FoodDTO());
//		listData.add(new FoodDTO());
//		return success(listData);
//	}
	
//	@PostMapping("/")
//	public Map<String, Object> saveFood() {
//		RootResponse root =new RootResponse();
//		root.setCode(ResponseCode.SUCCESS);
//		root.setBody(SaveFoodReponse.builder().id(5L).build());
//		return success(SaveFoodReponse.builder().id(5L).build());
//	}
//
//	@GetMapping("/{id}")
//	public RootResponse finDetail(@PathVariable("id") Long id) {
//		RootResponse root =new RootResponse();
//		root.setCode(ResponseCode.SUCCESS);
//		FoodDTO dto = null;
//		if(dto == null) {
//			throw new DataNotFoundException("thoog tin nay khong tim thay");
//		}
//		return root;
//	}
	@GetMapping("/list")
    public com.example.food.response.BaseResponse<List<UserResponse>> list(){
        List<UserResponse> listData = new LinkedList<>();
        listData.add(new UserResponse());

        return com.example.food.response.BaseResponse.success(listData);

    }
    @GetMapping("list-user")
    public BaseResponse<List<UserResponse>> ListUser(){
        return BaseResponse.success("Get list user success",foodBusiness.ListUser());
    }
    @PostMapping("create-user")
    public BaseResponse<IdResponse> CreateUser(@Valid @RequestBody UserRequest input){
        return BaseResponse.success("create user success",foodBusiness.CreateUser(input));
    }

//    @PostMapping("register")
//	    public BaseResponse<IdResponse> Register(@RequestBody RegisterRequest input){
//            return BaseResponse.success("register user success",foodBusiness.Register(input));
//    }


	
	
	
//	private Map<String, Object> success(Object object){
//		Map<String, Object> root = new HashMap<>();
//		root.put("code", ResponseCode.SUCCESS);
//		root.put("message", null);
//		root.put("payload", object);
//		return root;
//	}
}
