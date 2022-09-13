package com.example.food.response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse<T> {
	private Integer code;
    private String message;
    private T payload;

    private BaseResponse(){

    }

    private static <T> BaseResponse<T> result(Integer code, String message, T payload){
        BaseResponse<T> result = new BaseResponse<T>();
        result.code = code;
        result.message = message;
        result.payload = payload;
        return result;
    }
    public static <T> BaseResponse<T> result(Integer code, String message){
        return result(code, message, null);

    }
    public static <T> BaseResponse<T> success(T payload){
        return success(HttpStatus.SUCCESS.value, payload);
    }

    public static <T> BaseResponse<T> success(String message, T payload) {
        return result(HttpStatus.SUCCESS.status,message,payload);
    }
    public static <T> BaseResponse<T> fail(String message, T payload){
        return result(HttpStatus.FAIL.status, message,payload);
    }

    @Getter
    public enum HttpStatus {

        SUCCESS(200, "SUCCESS"),
        FAIL(100, "FAIL"),
        NOT_FOUND(404, "NOT_FOUND"),
        UNAUTHORIZED(401, "UNAUTHORIZED");

        private Integer status;
        private String value;

        HttpStatus(Integer status, String value) {
            this.status = status;
            this.value = value;
        }
    }

}
