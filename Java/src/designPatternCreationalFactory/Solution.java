package designPatternCreationalFactory;

import java.util.*;
import java.math.*;

// Do not modify Change
class Change {
    long coin2 = 0;
    long bill5 = 0;
    long bill10 = 0;
}

class Solution {
    
    // Do not modify this method​​​​​​‌​​​​‌‌‌​​​​‌‌​‌​‌​​‌‌​‌‌ signature
    static Change optimalChange(long s) {
    Change ch = new Change();
    int balance =0;
    if (s>= 10)
    {
    	ch.bill10 = s/10;
        balance = (int) (s - (ch.bill10*10));	
    }
    if (s <10)
    	balance = (int) s;
    if (balance < 10 && balance >= 5)
    {
    	 ch.bill5 = balance/5;
    	 balance = (int) (balance - (ch.bill5*5));
      }
    if (balance < 5)
    {
    	ch.coin2 = balance/2;
    }
     
     return ch;
     
    }
    public static void main(String[] args) {
    	long s = 10L; // Change this value to perform other tests
    	Change m = Solution.optimalChange(s);

    	System.out.println("Coin(s)  2€: " + m.coin2);
    	System.out.println("Bill(s)  5€: " + m.bill5);
    	System.out.println("Bill(s) 10€: " + m.bill10);

    	long result = m.coin2 * 2 + m.bill5 * 5 + m.bill10 * 10;
    	System.out.println("\nChange given = " + result);
	}
}
