package com.company.Stringdemo1;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        //替换敏感词汇
        Scanner sc=new Scanner(System.in);
        System.out.println("输入不文明用语：");
        String talk=sc.next();
        String []arr={"tmd","sb","nmsl"};
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println("请文明发言：");
        System.out.println(talk);
    }
}
