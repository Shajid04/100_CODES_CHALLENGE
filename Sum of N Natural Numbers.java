// Sum of N Natural Numbers


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