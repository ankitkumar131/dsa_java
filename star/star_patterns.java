
import java.util.*;


public class star_patterns {
    public static void main(String[] args) {
        
        // inverted half pyramid pattern with stars(n-i+1) n is number of lines and i is line number  top down
        // for(int i = 1; i <= 10; i++){
        //     for(int j = 1; j <= (10-i+1); j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // hald peramid pattern with numbers(i) n is number of lines and i is line number bottom up
        for(int i =1; i<=4;i++){
            for(int j =1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

        // half peramaid with characters but in cuntinuation form A-Z
       
        // a
        // bc
        // def
        // ghi
        // jklm
        // nopqr
        // stuvwx

        int n = 4;
        int ch = 1;

        for(int line = 1; line<=n; line++){
            for(int j =1; j<=line; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
                

    }
}
