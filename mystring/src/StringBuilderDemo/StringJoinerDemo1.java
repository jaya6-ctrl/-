package StringBuilderDemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","=",".");
        String str=sj.add("aaa").add("bbb").add("ccc").toString();

        System.out.println(sj);
        System.out.println(str);
    }
}
