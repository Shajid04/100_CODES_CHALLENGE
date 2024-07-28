// Program to find the Positive and Negative numbers

import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(n>=0){
            if(n==0)
            System.out.println("Zero");
            else
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}


/* Another methods to solve this Problem 

>> Method 1:
-----------
using if ,else-if , else-if


>> Method 2:
-----------
Using the ternary Operator 
Code :
class Main
{
  public static void main (String[]args)
  {
    int num = 0;
    //Condition to check if the number is negative or positive
    if (num == 0)
      {
	    System.out.println ("Zero");
      }
    else{
        String result = num > 0 ? "The number is positive" : "The number is negative";
        System.out.println (result);
    }
  }
}

