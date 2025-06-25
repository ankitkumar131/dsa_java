import java.util.*;

public class javafunctions {

    public static int sum(int q, int w){
        int sum = q + w;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = sc.nextInt();
        
        int sum = sum(a, s);
        System.out.println("The sum is "+sum);
        
    }
}