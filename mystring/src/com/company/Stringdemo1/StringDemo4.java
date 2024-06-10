package com.company.Stringdemo1;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符");
        String str=sc.next();
        //遍历
        for (int i = 0; i <str.length(); i++) {
             char c=str.charAt(i);
            System.out.println(c);
        }
    }
}
