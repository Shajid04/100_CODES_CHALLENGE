/* 

Find the Greatest of the Two Numbers in Java
---------------------------------------------------
Given two integer inputs N1 and N2, the objective is to write a code to Find the Greatest of the Two Numbers in Java. In order to do so we’ll compare the numbers using if-else statements.
 
Example
Input : num1 = 12 and num2 = 3
Output : 12

*/

import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
         // prints the maximum of two numbers
         //   System.out.println(Math.max(num1, num2) + " is greater");
        
        if(num1 == num2){
            System.out.println(num1 + " and " + num2 + " are equal.");
        }
        else if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else{
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}