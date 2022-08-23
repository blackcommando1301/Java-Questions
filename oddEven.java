import java.util.*;
public class oddEven {
    public static void main(String[] args){
            int[] arr={1,2,3,4,5,6,7,8,9,10};
            ArrayList<Integer> even=new ArrayList<>();
            ArrayList<Integer> odd=new ArrayList<>();
            for(int i:arr){
                if(i%2==0){
                    even.add(i);
                }else{
                    odd.add(i);
                }
            }
            int idx=0;

            for(int i:even){
              arr[idx]=i;
              idx++;
            }
            for(int i:odd){
                arr[idx]=i;
                idx++;
              }


              for(int i:arr){
                System.out.print(i + " ");
              }
    }
}
