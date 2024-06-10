package tset;

import java.util.Scanner;

public class Test1Case2  {
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
            String luoma=changeluoma(c);
            sb.append(luoma);
        }
        System.out.println(sb);


    }

    public static String changeluoma(char number){
        String str;
        switch (number){
            case '0'->str="";
            case '1'->str="Ⅰ";
            case '2'->str="Ⅱ";
            case '3'->str="Ⅲ";
            case '4'->str="Ⅳ";
            case '5'->str="Ⅴ";
            case '6'->str="Ⅵ";
            case '7'->str="Ⅶ";
            case '8'->str="Ⅷ";
            case '9'->str="Ⅸ";
            default -> str="";
        }
        return str;
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
