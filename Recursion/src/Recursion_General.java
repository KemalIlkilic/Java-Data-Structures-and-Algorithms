public class Recursion_General {
	public static void main(String[] args) {
		System.out.println(powerOfTwoRecursion(8));
		System.out.println(powerOfTwoIterative(8));
		System.out.println(factorialRecursive(6));
		System.out.println(fibonacciRecursive(10));
		
	}
	static int powerOfTwoRecursion(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return 2 *powerOfTwoRecursion(n-1);
		}
	}
	static int powerOfTwoIterative(int n) {
		int result = 1;
		for(int i = 0;i<n;i++) {
			result *= 2;
		}
		return result;
	}
	static int factorialRecursive(int n) {
		if(n<0) {
			return -1;
		}
		else if(n==0 || n==1) {
			return 1;
		}
		else {
			return n * factorialRecursive(n-1);
		}
	}
	static int fibonacciRecursive(int n) {
		if (n<0) {
			return -1;
		}
		if(n==0 || n==1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
}
