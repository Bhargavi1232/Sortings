import java.util.*;

class cyclesort{
    public static void main(String args[]){
        int arr[]={6,5,3,1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,correct,i);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}