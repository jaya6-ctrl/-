package StringBuilderDemo;

public class StringBuildDemo1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        sb.reverse();
        int len=sb.length();
        System.out.println(len);
        System.out.println(sb);
    }
}
