package com.company.Stringdemo1;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //已知正确的用户名和密码，请用程序实现用户登录。
        // 总共给三次机会，登录之后，给出相应的提示。
      String username="wangzhiwei";
      String userpasswd="123456";
      Scanner sc=new Scanner(System.in);
      int count=3;
      while(count>0) {
          System.out.println("请输入用户名：");
          String name = sc.next();
          System.out.println("请输入密码：");
          String passwd = sc.next();
          boolean s1 = username.equals(name);
          boolean s2 = userpasswd.equals(passwd);
          if (s1 == true && s2 == true) {
              System.out.println("成功登录");
              break;
          }else{
              System.out.println("输入用户名或密码不正确，还剩"+(count-1)+"次机会");
          }
          count--;
      }



    }
}
