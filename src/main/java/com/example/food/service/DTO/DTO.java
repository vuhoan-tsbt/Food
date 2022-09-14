//package com.example.food.service.DTO;
//
//import org.apache.commons.beanutils.PropertyUtils;
//
//import java.lang.reflect.InvocationTargetException;
//
//public interface DTO {
//    public default void copyProperties(Object dest, Object src) {
//        try {
//            PropertyUtils.copyProperties(dest, src);
//        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//    }
//}
