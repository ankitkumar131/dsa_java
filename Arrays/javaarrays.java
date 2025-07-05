import java.lang.*;
// import java.sql.Array;
import java.util.*;

public class javaarrays{
    public static void lecture1(){
        int marks[] = {1,2,3,4,5};
        for(int i =0 ; i<= marks.length; i++){
            if(marks[i]==5){
                System.out.println("in the list");
                break;
            }
        }
    }

    public static void get_largest_array(int numbers[]){
        

        

        int max_value = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            if(max_value<numbers[i]){
                max_value = numbers[i];
            }
        }
        System.out.println(max_value);
    }


    public static int binary_search(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //compare
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;

    }


    public static void reverse_array(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
    }


    public static void second_largest(int arr[]){
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int q;
        for(int i =0; i<arr.length; i++){
            for(int j = arr.length; j>=0; j--){
                if(arr[i]<largest){
                    q = arr[i];
                    
                }
            }
        }
        System.out.println("Second Largest Integer is: "+ q);
    }



    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,10,7,8,9};
        int toFind = 0;

        //get_largest_array(numbers);
        //toFind = binary_search(numbers, toFind);
        //System.out.println(toFind);
        // reverse_array(numbers);

        int arrr[] = {1,2,5,7,8,9,6,4,2,4,5,8,7,7,10,13,58,55};

        second_largest(arrr);

        
    }
}