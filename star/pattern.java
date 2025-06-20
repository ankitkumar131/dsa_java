import java.util.*;


public class pattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();


        /*
         * 1
         * 21
         * 321
         * 4321
         */

        int row = 1;
        while(row<=n){
            int col = 1;
            // int value = n;

            while(col<=row){
                System.out.print(row-col+1);
                // value--;
                col++;
            }
            System.out.println();
            row++;
        }



    }
    
}
