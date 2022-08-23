import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args){

        int[] arr={1,2,2,2,3,3,3,4,4,4,4,5,5,5,5,5,7,7 };

        HashSet<Integer> hs=new HashSet<>();

        for(int i:arr){
            hs.add(i);
        }
       for(int i:hs){
        System.out.print(i + " ");
       }
}
}
