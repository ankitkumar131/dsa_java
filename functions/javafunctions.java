import java.util.*;

public class javafunctions {

    public static int sum(int q, int w){
        int sum = q + w;
        return sum;
    }

    public static void hollow_rectangle(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int row = 1;
        for(int i = 1;i<=a;i++){
            for(int j = 1; j<=b; j++){
                if(i==1 || i==a || j == 1 || j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void star_pattern1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
           
        }
         
    }

    public static void star_pattern2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void star_pattern3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }System.out.println();
        }
    }

    public static void star_pattern4(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }


    public static void star_pattern5(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
    }
    

    public static void star_pattern6(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1st half
        for(int i= 1; i<=n; i++){
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // spaces 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--){
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // spaces 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void star_pattern7(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 2nd half
        for(int i=n; i>=1; i--){
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // spaces 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 1st half
        for(int i= 1; i<=n; i++){
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // spaces 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }

    public static void star_pattern8(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 2nd half
        for(int i=n; i>=1; i--){
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }

            // spaces 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print("*");
            }
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
        // 1st half
        for(int i= 1; i<=n; i++){
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }

            // spaces 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print("*");
            }
            // stars = i
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        
    }

    public static void star_pattern9(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void star_pattern10(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n; j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void star_pattern11(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1st half

        for(int i =1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i = n; i>=1; i--){
            //spaces
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void star_pattern12(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void star_pattern13(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for(int i = n-1; i >= 1; i--){
            //spaces
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    public static void star_pattern14(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i <= n; i++){
            //spaces
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j = i;j>=1; j--){
                System.out.print(j);
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        

        star_pattern14();

        
    }
}