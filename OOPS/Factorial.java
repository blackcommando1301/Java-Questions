import java.util.*;
public class Factorial {
    
public static void main(String[] args){
   

    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    char ch=sc.next().charAt(0);

   System.out.println(RemoveCharacter(str, ch));
    System.out.println(RemoveAllOcuurence(str));

    



   
}

public static String RemoveCharacter(String str, char ch){
    String ans="";

    for(int i=0;i<str.length();i++){

        if(str.charAt(i)!=ch){
            ans+=str.charAt(i);
        }
    }

    return ans ;
}

public static String RemoveAllOcuurence(String str){
    String ans="";
    int count=0;
    for(int i=1;i<str.length();i++){
        char curr=str.charAt(i);
        char pre=str.charAt(i-1);

        if(pre!=curr){
            ans+=pre;
            count=0;
        }else{
            count++;
        }
    }

    if(count>0){
        ans+=str.charAt(str.length()-1);
    }

    return ans;
}




}