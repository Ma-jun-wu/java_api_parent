package com.tedu.cn;

import org.junit.Test;

public class StringApi {
    @Test
    public void m1(){
        String regex="(\\+86)?\\s?\\d{11}";
        String phone="+86 18885604356";
        if (phone.matches(regex)){
            System.out.println("手机合法");
        }else {
            System.out.println("手机不合法");
        }
    }
}
