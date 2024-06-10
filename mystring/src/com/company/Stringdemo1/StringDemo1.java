package com.company.Stringdemo1;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1=sc.next();
        String s2="abc";
        boolean end=s1.equals(s2);
        System.out.println(end);
    }
}
