/*
Find the Greatest of the Three Numbers in Java
Given three integers num1, num2 and num3 as inputs. The objective is to write a code to Find the Greatest of the Three Numbers in Java Language. To do so we’ll check the numbers with each other and print the largest of them all.
 
Example
Input : num1 = 12 num2 = 9 num3 = 14
Output : 14
*/

import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
    //checking if num1 is greatest
    if (num1 >= num2 && num1 >= num3)
        System.out.println (num1 + " is the greatest");

    //checking if num2 is greatest
    else if (num2 >= num1 && num2 >= num3)
        System.out.println (num2 + " is the greatest");

    //checking if num2 is greatest
    else if (num3 >= num1 && num3 >= num2)
        System.out.println (num3 + " is the greatest");
        
    }
}