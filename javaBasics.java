import java.util.*;

public class javaBasics{
    public static void main(String[] args){
        // conditional statements
        // Scanner input = new Scanner(System.in);
        // int income = input.nextInt();

        // int tax;
        
        // if(income <500000){
        //     tax = 0;
           
        // }

        // else if(income>500000 && income<1000000){
        //     tax = (int) (income*0.2); 
            
        // }

        // else{
        //     tax = (int)(income * 0.3);
            
        // }
        // System.out.println("your tax is " + tax);


        // loops
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();

        // int sum = 0;

        // int i=1;
        // while(i <= range){
        //     System.out.print(sum + " ");
        //     sum += i;
        //     i++;

        // }
        // System.out.println(sum);

        // for loop

        // for(int i = 0; i<=10; i++){
        //     System.out.println(i);
        // }

        // reverce of a number

        // int n = 1234;

        // while(n>0){
        //     int last_digit = n%10;
        //     n /=10;

        //     System.out.print(last_digit);

        // }


        // reverse of a number method 2

        // int n = 1234;

        // int rev =0;

        // while(n>0){
        //     int last_digit = n % 10;
        //     rev = (rev * 10) + last_digit;
        //     n /=10;
        // }

        // System.out.println(rev);

        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.print("Enter Your Number : ");   
        //     int num = sc.nextInt();
        //     if(num % 10 == 0){
        //         System.out.println(num + " number is divisible by 10");
        //         break;
        //     }
               
        //         System.out.println(num);
            
        // } while(true);

       // display all numbers entered by user except multiples of 10

    //    int i = 0;
    //    Scanner sc = new Scanner(System.in);
       
    //    do{
    //     System.out.print("Enter Your Number : ");
    //     int num = sc.nextInt();
    //     if(num % 10 ==0 ){
    //         continue;
    //     }
    //     System.out.println("The number is " + num);
    //    }while(true);
       


    // check if the number is prime or not

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter Your Number : ");
    // int num = sc.nextInt();
    
    // boolean isPrime = true;
    
    // if(num == 2){
    //     System.out.println(num + " is a prime number");
    // }else{
    //     for(int i =2; i< num; i++){
    //         if(num % i == 0){
    //             isPrime = false;
                
    //         }
    //     }
    //     if(isPrime== true){
    //         System.out.println(num + " is a prime number");
    //     }else{
    //         System.out.println(num + " is a composite number");
    //     }
    // }

    // Writeaprogramthatreadsasetof integers,andthenprintsthesumofthe  even and odd integers.

    // Scanner sc = new Scanner(System.in);

    // int odd = 0;
    // int even = 0;
    // int total = 0;
    // System.out.print("How many numbers you want to enter : ");
    // int num = sc.nextInt();
    // int i = 0;
    // while(i<num){
    //     System.out.print("Enter your number : ");
    //     int n = sc.nextInt();
    //     if(n%2 == 0){
    //         even += n;
    //     }else{
    //         odd+=n;
    //     }
    //     total += n;
    //     i++;
    // }
    // System.out.println("The sum of even numbers is " + even);
    // System.out.println("The sum of odd numbers is " + odd);
    // System.out.println("The sum of all numbers is " + total);

    //Write a program to find the factorialof any number entered by the user.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number : ");
    int num = sc.nextInt();
    int fact =1;

    for(int i = 1; i <= num; i++){
        fact *=i;
    }
    System.out.println("The factorial of " + num + " is " + fact);


       
       
    }
}