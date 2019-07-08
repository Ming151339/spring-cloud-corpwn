package com.zhiyou100.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JSONUtils {

    public  static  String object2Json(Object object){
        ObjectMapper om = new ObjectMapper();
        try {
            //转换对象为 JSON
           return  om.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
    public  static <T> T  json2Object(String  json,Class<T> clazz){

        ObjectMapper om = new ObjectMapper();
        try {
            return  om.readValue(json,clazz);
        } catch (IOException e) {
            e.printStackTrace();
            return  null;
        }
    }
}
