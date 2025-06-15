package star;
import java.util.*;


public class star_patterns {
    public static void main(String[] args) {
        
        // inverted half pyramid pattern with stars(n-i+1) n is number of lines and i is line number 
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= (10-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
