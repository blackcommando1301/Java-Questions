public class armstrong {
    public static void main(String[] args){
        int n=121;
        int res=check(n);
       System.out.println(res==n);
    }

    public static int  check(int n){
        if(n<10){
            return n*n*n;
        }

        int lastDigit=n%10;
        int cube=lastDigit*lastDigit*lastDigit;
        return cube + check(n/10);
    }
}
