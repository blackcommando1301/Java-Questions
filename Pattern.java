public class Pattern {
    public static void main(String[] args){


        int n=2;
        int idx=1;
        int count=1;

        for(int i=0;i<n;i++){
           
            for(int j=0;j<n;j++){
                
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
            idx++;
            count=idx;
        }
    }
}
