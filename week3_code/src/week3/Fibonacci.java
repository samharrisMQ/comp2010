package week3;

public class Fibonacci {
	int N= 100;
	int LookUp[]= new int[N];
	
	Fibonacci() {
    LookUp[0]= 1; LookUp[1]= 1;
	}
	
	int fib1(int n) {
		 if (n <= 1) return 1;
		 else return fib1(n-1) + fib1(n-2);
		}
	
	int fast_fib(int n) {
		  if (n <= 1) return 1;
		  else {
		     for (int j= 2; j < n+1; j++)
		    	 LookUp[j]= LookUp[j-1] + LookUp[j-2];
		       }
		 return LookUp[n];
		}
	
	

}
