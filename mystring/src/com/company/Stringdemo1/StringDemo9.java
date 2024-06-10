package com.company.Stringdemo1;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入身份证号");//370829200306180339
            String bodynumber = sc.next();
            if (bodynumber.length() == 18) {
                String year = bodynumber.substring(6, 10);
                String mon = bodynumber.substring(10, 12);
                String day = bodynumber.substring(12, 14);
                char c = bodynumber.charAt(16);
                int gendernumber = c - 48;
                char gender;
                if (gendernumber % 2 == 0) {
                    gender = '女';
                } else {
                    gender = '男';
                }
                System.out.println("人物信息为：");
                System.out.println("出生年月日：" + year + "年" + mon + "月" + day + "日");
                System.out.print("性别为：" + gender);
                break;
            } else {
                System.out.println("身份证输入有误,重新输入！");
            }
        }
    }
}
