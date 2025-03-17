package week2;

import static org.junit.Assert.assertEquals;

import java.util.*; 

import org.junit.Test;

public class ComputingPowers {
	
	static int slowPower(int n, int x){
		// Precondition: n > 0 AND x > 0
		// Postcondition: Returned value is equal to x^n
		// Time complexity: O(n)
		int answer= 1;
		for(int i=0; i< n; i++){ // Invariant is answer == x^i
			try {
			Thread.sleep(10);  // To slow things down so we can measure the time
			answer= answer*x;
			} catch(InterruptedException e){e.printStackTrace();}
		}
		return answer;		
	}
	
	static int fastPower(int n, int x){
		// Precondition: n > 0 AND x > 0
		// Postcondition: Returned value is equal to x^n
		// Time complexity: O(log n)
		int a= x; int b= 1; int i= n;
		while(i>0) {  // Invariant: a^i*b == x^n
			try {
				Thread.sleep(10);  // To slow things down so we can measure the time
			if (i%2==0){
				a= a*a;
				i= i/2;
			}
			else {
				b= a*b;
				i= i-1;
			}
			} catch(InterruptedException e){e.printStackTrace();}
		}
		return b;
	}
	
	public static void main(String[] args) {
		 int x;
		 int n= 30;
		 StopWatch s = new StopWatch();	
		 for (int k=1; k<n; k=k+5) {

		 System.out.println("k is " + k);
		 s.start();
		 x= slowPower(k, 2);
		 s.stop();
		 System.out.println("slowPower computes value " + x);		 
		 System.out.println("slowPower takes " + s.getElapsedTime());
	 
		 s.start();
		 x= fastPower(k, 2);
		 s.stop();
		 System.out.println("fastPower computes value " + x);
		 System.out.println("fastPower takes " + s.getElapsedTime());		 
	}
  }
	
	@Test 
	public void testSlow() { 
		int x= 6;
		int y= 2;// A non trivial case 
		
		int ans= slowPower(x, y);// 
		assertEquals(ans, 64);
		
		x=0; y=2; // Special case 0 exponent
		ans= slowPower(x, y);
		assertEquals(ans, 1);
		
		x=10; y=0; // A base case
		ans= slowPower(x, y);
		assertEquals(ans, 0);
	}
	
	@Test 
	public void testFast() { 
		int x= 6;
		int y= 2; // A non trivial case 
		
		int ans= fastPower(x, y);// 
		assertEquals(ans, 64);
		
		x=0; y=1; // Special case 0 exponent
		ans= fastPower(x, y);
		assertEquals(ans, 1);
		
		x=10; y=0; // Special case 0
		ans= fastPower(x, y);
		assertEquals(ans, 0);
	}	
}

