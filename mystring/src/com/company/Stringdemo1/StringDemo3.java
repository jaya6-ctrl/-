package com.company.Stringdemo1;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //2.统计，计数器思想
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            }else if(c>='0'&&c<='9'){
                numCount++;
            }
        }
        System.out.println("大写字符字数："+bigCount);
        System.out.println("小写字符字数："+smallCount);
        System.out.println("数字字符字数："+numCount);

    }
}
