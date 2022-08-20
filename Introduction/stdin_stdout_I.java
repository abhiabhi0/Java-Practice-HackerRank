/***
*  One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in.
***/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // Complete this line

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
