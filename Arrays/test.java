class Main {
  
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void swap(int arr[], int i, int j){
      while(i < j){
          int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;   // increment i
            j--;   // decrement j
            
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        print(arr);
        int r = 2;

        int n = arr.length;

        int i = 0, j = n - 1;
        swap(arr,i,j);
        
        {
          swap(arr,i=0, j=n-3);
          
          swap(arr, i=8, j=9);
          print(arr);
        }
        

        
    }
}
