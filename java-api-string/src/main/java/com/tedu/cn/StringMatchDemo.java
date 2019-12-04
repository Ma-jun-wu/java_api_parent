package com.tedu.cn;

import org.junit.Test;

public class StringMatchDemo {
    @Test
    public void m1(){
        //基本匹配规则：
        String regex="[a-z]";
        System.out.println("a".matches(regex));
        regex="[a-zA-Z0-9]";
        System.out.println("z".matches(regex));
        regex="[^(a-zA-Z0-9)]";
        System.out.println("-".matches(regex));
        regex="[a-z&&^abc]";
        System.out.println("a".matches(regex));
    }
    @Test
    //测试预定义字符串
    public void m2(){
        String reg="\\d";
        System.out.println("9".matches(reg));
        System.out.println("----------");
        reg="\\d+";
        System.out.println("98".matches(reg));
        System.out.println("----------");
        reg="\\d*";
        System.out.println("123".matches(reg));
        System.out.println("---------");
        reg="\\d?";
        System.out.println("123".matches(reg));
        System.out.println("---------");
        reg="\\d{5}";
        System.out.println("12345".matches(reg));
        System.out.println("---------");
        reg="\\d{5,}";
        System.out.println("12345567".matches(reg));
        System.out.println("----------");
        reg="\\d{5,9}";
        System.out.println("12345567".matches(reg));
        System.out.println("----------");
        reg="\\d^{5,9}$";
        System.out.println("12345567".matches(reg));
    }
}
