import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
        	int n = sc.nextInt();
        	int a=0, b=0, c=0;
        	int sumOfbAndc = b+c;
        	int diffOfcAndb = c-b;
        	for (a=1; a < n-2; a++){
        		sumOfbAndc = n-a;
        		diffOfcAndb = (a*a)/sumOfbAndc;
        		
        	}
        }
        sc.close();
    }
    
}