package com.company.Stringdemo1;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //定义一个方法，实现字符串的反转
        //键盘录入一个字符串，调用该方法后，在控制台输入结果
        //例如键盘录入abc，输出结果cba。
        //1.键盘输入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        String result=ToString(str);
        System.out.println(result);

    }
    public static String ToString(String arr){
        String result="";
         for(int i=arr.length()-1;i>=0;i--)
        {
            char c=arr.charAt(i);
            result=result+c;
        }
        return result;
    };
}
