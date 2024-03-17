package Sorting;

public class Sort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){ //to iterate through each array element
//      for (int j : arr) {    enhanced for syntax
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static  void main(String[] args){
        int[] arr ={6,8,3,1,2,5};
        //BUBBLE SORT: elements decrease from end of array
        //time complexity: O(n^2) not a good time complexity.
        for(int i=0;i<arr.length-1;i++){ //for n-1 array elements
            for(int j=0;j< arr.length-i-1;j++){ //for elements that are left behind in array to be sorted
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);

        //SELECTION SORT: elements decrease from start of array
        //time complexity:O(n^2)
        for(int i=0;i< arr.length-1;i++){ //for n-1 array elements
            int smallest =i; //storing index of smallest element
            for(int j=i+1;j<arr.length;j++){ //starting the sorting from
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);


        //INSERTION SORT
        //time complexity:O(n^2)(worst), best:O(n)
        for(int i=1;i<arr.length;i++){//n-1
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;
        }
        printArray(arr);
    }
}
