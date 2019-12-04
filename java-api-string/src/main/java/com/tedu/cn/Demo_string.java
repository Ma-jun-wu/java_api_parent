package com.tedu.cn;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class Demo_string {
    public static void main(String[] args) {
        String str="i love you";
        boolean f=str.contains("you");
        System.out.println(f);

        String str1="i love";
        str1=str1.concat(" you");
        System.out.println(str1);
    }
    @Test
    public void testUpperCase(){
        String str="shg";
        System.out.println(str.toUpperCase());
    }
    @Test
    public void testEqualsAndIgnoreCase(){
        String str1="abc";
        String str2="abc";
        String str3="ABC";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
    }
    @Test
    public void testGetBytes() throws UnsupportedEncodingException {
        /**
         * j将给定字符串转化成byte类型
         */
        byte[] bs="i love you".getBytes("UTF-8");
        for(int i=0;i<bs.length;i++){
            System.out.println(bs[i]);
        }
    }
    @Test
    public void testSubString(){
        String str="i love you";
        String str1="hudfguwgfug.baidu.comhaufgaagdf";
        String b="baidu.com";
        System.out.println(str1.substring(str1.indexOf(b),str1.indexOf(b)+b.length()));
        System.out.println(str.substring(2,6));
    }
    @Test
    public void builder(){
        StringBuilder builder =new StringBuilder();
        builder.append("i love you");
        builder.append(2019);
        builder.append(" will be end");
        System.out.println(builder.toString());
    }
    @Test
    public void m2(){
        StringBuilder builder=new StringBuilder("I love you");
        builder.append(2019);
        builder.append("I hate you");
        System.out.println(builder.toString());
        builder.replace(builder.indexOf("hate"),builder.indexOf("hate")+"hate".length(),"love");
        System.out.println(builder.toString());
        //删除
        //builder.delete()
    }
}
