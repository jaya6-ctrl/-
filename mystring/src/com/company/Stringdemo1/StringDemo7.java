package com.company.Stringdemo1;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.键盘录入
        int money;
        while (true) {
            System.out.println("请输入一个金额：");
            money = sc.nextInt();
            if (money >= 0&&money<=9999999) {
                break;
            } else {
                System.out.println("输入金额有误！！！！！！！");
            }
        }
        //2.金额大小写转换
        String endmoney = "";
        while (true) {
            int number = money % 10;//123
            String getCapitalNumber = getCapitalNumber(number);
            endmoney = getCapitalNumber + endmoney;
            money = money / 10;
            if (money== 0) {
                break;
            }
            //System.out.println(money);}
        }
        //3.补全七位
        int count=7-endmoney.length();
        for (int i = 0; i <count; i++) {
            endmoney=getCapitalNumber(0)+endmoney;
        }
        //4.插入单位
         String []arrNumber={"佰","拾","万","仟","佰","拾","元"};
        String answer="";
        for (int i = 0; i < endmoney.length(); i++) {
              char c=endmoney.charAt(i);
              answer=answer+c+arrNumber[i];
        }
        System.out.println(answer);
    }


        public static String getCapitalNumber(int number){
            String str = "";
            String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
            str = arr[number];
            return str;
        }
    }
