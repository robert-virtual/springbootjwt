package com.example.springbootjwt.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tokens {
    // should be properties of the project or environment variables
    private final static String ACCESS_TOKEN_SECRET = "4915b02035f9f390db15";
    private final static long ACCESS_TOKEN_EXPIRES_IN_MILLISECONDS = 60*60*1000;// should be less in production

    public static String createToken(String name,String email){
        Date expirationDate = new Date(System.currentTimeMillis()+ACCESS_TOKEN_EXPIRES_IN_MILLISECONDS);
        Map<String,Object> res = HashMap<>();
        res.put("name",name);
        return jwt;
    }
}
