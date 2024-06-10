package com.company.Stringdemo1;

public class StringDemo5 {
    public static void main(String[] args) {
         int []arr={1,2,3,4};
         String result=arrToString(arr);
        System.out.println(result);
    }

    //遍历数组按照一个字符串返回
    public static String arrToString(int []arr){
        if(arr==null){
            return "";
        }
        if(arr.length==0){
            return "";
        }
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1){
                result=result+arr[arr.length-1]+"]";
            }else{
            result=result+arr[i]+",";}
        }
         return result;
    }

}
