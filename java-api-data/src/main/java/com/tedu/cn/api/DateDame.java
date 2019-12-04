package com.tedu.cn.api;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDame {
    @Test
    public void m1(){
        //获取日历对象
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
    @Test
    public void m2(){
        Date date=new Date();
        System.out.println(date);
        //返回1970年1月1月00点00分00秒到现在的毫秒数；
        System.out.println(date.getTime());
        System.out.println("**************");
        //将给定的毫秒数转化为日期；
        Date date1=new Date(1575428271739L);
        System.out.println(date1.after(date));
        //把毫秒转换成时间；
        date.setTime(1575428271739L);
    }
    @Test
    //测试日期格式化；
    public void m3(){
        //将具体的日期格式化；
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date= format.format(new Date());
        System.out.println(date);
    }
    @Test
    public void m4() throws ParseException {
        String date="2019.12.04 11:18:46";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        Date d=sdf.parse(date);
        System.out.println(d);
    }
}