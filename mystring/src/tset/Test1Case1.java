package tset;

import java.util.Scanner;

public class Test1Case1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str;
        while (true) {
            System.out.println("请输入一个字符串：");
            str = sc.next();
            //校验是否满足字符串
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("请重新输入！！！！！");
                continue;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            int number=c-48;
            String luoma=changeluoma(number);
            sb.append(luoma);
        }
        System.out.println(sb);


    }

    public static String changeluoma(int number){
        String[]arr={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[number];
    }
    public static boolean checkStr(String str){
        if(str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
           char c=str.charAt(i);
           if(c<'0'||c>'9') {
               return false;
           }
        }
        return true;
    } 
}
