import java.util.*;
public class palindrome{
  
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
  StringBuilder sb=new StringBuilder(s);

  sb=sb.reverse();
  String rev=sb.toString();

        System.out.println(s.equals(rev));

    }
}