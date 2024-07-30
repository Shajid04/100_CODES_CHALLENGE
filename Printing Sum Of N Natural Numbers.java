// Sum of N Natural Numbers

/* Given an integer input “num” the objective is to sum up all the numbers that lay in the interval [0,num]. To do so we’ll write a code to Find the Sum of N Natural Numbers in Java.

Example
Input : 6
Output : 21
Explanation : 0 + 1 + 2 + 3 + 4 + 5 + 6 = 21.

*/

// This codes time complexity is O(n)
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}


/* Better Way of this code can be written as 

Direct Sum of natural number formula : n*(n+1)/2 || YTime complexity : O(1)
--------------------------------------------------
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*(n+1)/2);
    }
}
*/