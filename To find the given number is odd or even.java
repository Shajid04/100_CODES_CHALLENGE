// To find the given number is odd or even 

import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        
        if(n%2==0){
            System.out.println(n + " is Even Number");
        }
        else{
            System.out.println(n+" is Odd Number");
        }
    }
}

/* Other Methods to solve the Question

>>Using Ternary Operator :
------------------------------
 public class Main
 {
   public static void main (String[]args)
   {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
     //Checking if the number is divisible by 2
     String status = number % 2 == 0 ? " is Even" : " is Odd";
       System.out.println (number + status);
   }
 }

 
 