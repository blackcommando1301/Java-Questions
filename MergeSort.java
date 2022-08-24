public class MergeSort {
    
    public static void main(String[] args){

        // int[] arr1={1,2,4,6,7,9,10};
        // int[] arr2={3,4,5,6,7,9,11,12,13,17,20};

        int[] arr={9,5,3,1,8,5,6,8,1,3,5};

        int[] ans =mergeSort(arr, 0,arr.length-1);

        for(int i:ans){
            System.out.print(i + " ");
        }


    }

    public static int[] mergeSort(int[] arr, int low, int high){
       if(low==high){
        int[] ans= new int[1];
          ans[0]=arr[low];
          return ans ;
       }
        
        int mid=(low+high)/2;
        int[] arr1=mergeSort(arr, low, mid);
        int[] arr2=mergeSort(arr, mid+1, high);

        return mergeTwo(arr1, arr2);
    }


    public static int[] mergeTwo(int[] arr1,int[] arr2){

          int idx1=0;
          int idx2=0;
          int n1=arr1.length;
          int n2=arr2.length;
          int[] ans =new int[n1+n2];
          int ansIdx=0;

          while(idx1<n1 && idx2<n2){
            if(arr1[idx1]<arr2[idx2]){
                ans[ansIdx]=arr1[idx1];
                idx1++;
            }else{
                ans[ansIdx]=arr2[idx2];
                idx2++;
            }
            ansIdx++;
          }

          if(idx1<n1){
            while(idx1<n1){
                ans[ansIdx]=arr1[idx1];
                idx1++;
                ansIdx++;
            }
          }else{
            while(idx2<n2){
            ans[ansIdx]=arr2[idx2];
                idx2++;
                ansIdx++;
            }
          }

          return ans ;

    }
}
