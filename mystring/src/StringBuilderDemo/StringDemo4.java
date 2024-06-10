package StringBuilderDemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //StringBuilder sb=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String toStr= new StringBuilder().append(str).reverse().toString();
        if(str.equals(toStr)){
            System.out.println("是");
        }else{
            System.out.println("不是");

        }
    }
}
