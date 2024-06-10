package com.company.Stringdemo1;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //1.获取一个手机号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号11位数手机号码：");
        String number = sc.next();
        if (number.length() == 11) {
            //2.截取前三位
            String start = number.substring(0, 3);
            //3.截取后三位
            String end = number.substring(7, 11);
            //4.拼接
            String result = start + "****" + end;
            //5.输出结果
            System.out.println(result);
        }else{
            System.out.println("手机号输入有误");
        }
    }
}
