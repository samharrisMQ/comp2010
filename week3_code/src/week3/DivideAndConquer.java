package week3;

public class DivideAndConquer {
	
	static int power (int exp, int x) {
		if (exp==0) return 1;
		else {
			int temp= power (exp/2, x*x);
			if (exp%2 == 0) return temp;
			else return temp*x;
		}
	}
	
 	public static void main(String[] args ) {
 		
 		int x= 2;
 		int exp= 1;
 		
		System.out.println("x is" + x + " and exp is " + exp + " answer is " + power(exp, x));
	}

}
