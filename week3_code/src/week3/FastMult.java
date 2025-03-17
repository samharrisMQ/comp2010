package week3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FastMult {
	
  int twoDigit(int u, int v) {
	  //PRE: Both u, v are at least 0 and less than 100
	  if (u < 10 && v < 10) return u*v; // For less than to just return the result.
	  else {
		  int tu= u/10; // u = 10*tu + uu
		  int uu= u%10;
		  int tv= v/10; // v = 10*tv + uv
		  int uv= v%10;
		  return 100*twoDigit(tu,tv) + 10*(twoDigit(tu+uu, tv+uv) - twoDigit(tu,tv) -twoDigit(uv, uu)) + twoDigit(uv, uu);
	  }
  }	  
  
  public static void main(String[] args) {	
		// Test it on two digit numbers
	    FastMult test= new FastMult();
		int x= 44;
		int y= 99;
	
		System.out.println(" x times y is " + test.twoDigit(x, y));
		}
  
		
	
	@Test 
	public void testtwoDigit() {
		int x= 12;
		int y= 11;
		int answer= twoDigit(x, y);
		assertEquals(answer, 132);
		
		x=0; y= 12;
		answer= twoDigit(x, y);
		assertEquals(0, answer);
	    
		x=1; y= 12;
		answer= twoDigit(x, y);
		assertEquals(y, answer);
	}

  
} 
