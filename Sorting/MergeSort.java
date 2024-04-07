package Sorting;

public class MergeSort {
    public static void conquer(int[] arr, int start, int mid, int end){
        int[] merged =new int[end-start+1];//eg: e=4,s=0 for 5 elements, so we need to add 1, to match the length of arr[].

        int indx1=start;
        int indx2=mid+1;
        int x=0;

         while(indx1<=mid && indx2<=end){
             if(arr[indx1]<=arr[indx2]){
                 merged[x++]=arr[indx1++];
             }else{
                 merged[x++]=arr[indx2++];
             }
         }
         while(indx1<=mid){
             merged[x++]=arr[indx1++];
         }
         while (indx2<=end){
             merged[x++]=arr[indx2++];
         }

         for(int i=0,j=start;i< merged.length;i++,j++){
             arr[j]=merged[i];
         }


    }
    public static void divide(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);
    }
    public static void main(String[]args){
        int[] arr ={6,8,3,5,2,9};
        int n=arr.length;

        divide(arr,0,n-1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
