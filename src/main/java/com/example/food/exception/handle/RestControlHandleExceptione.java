//package com.example.food.exception.handle;
//
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
//
//import com.example.food.exception.data.DataNotFoundException;
//import com.example.food.response.RootResponse;
//
//@RestControllerAdvice
//public class RestControlHandleExceptione {
//
//	@ExceptionHandler({DataNotFoundException.class})
//	public RootResponse dataNotFoundException(DataNotFoundException ex,WebRequest webRequest) {
//		System.out.println(" dataNotFoundException");
//		RootResponse root = new RootResponse();
//		root.setCode(400);
//		root.setMessage(ex.getMessage());
//		return root;
//	}
//
//	@ExceptionHandler({Exception.class})
//	public RootResponse handleException(Exception ex,WebRequest webRequest) {
//
//		System.out.println(ex.getMessage());
//		RootResponse root = new RootResponse();
//		root.setCode(500);
//		root.setMessage(ex.getMessage());
//		return root;
//	}
//}
