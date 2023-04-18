public class Recursion_Questions {
	public static void main(String[] args) {
		System.out.println(sumOfDigits(5321));
		System.out.println(powerRecursive(3,0));
		System.out.println(gcdRecursion(120, 36));
		System.out.println(decimalToBinaryRecursion(5));
	}
	/* Question: How to find the sum of digits of a positive integer number using recursion ?
	 */
	static int sumOfDigits(int n) {
		if(n<0) return -1;
		if(n/10 == 0) {
			return n;
		}
		else {
			return n%10 + sumOfDigits(n/10);
		}
	}
	/* Question: How to calculate power of a number using recursion ?
	 */
	static int powerRecursive(int x, int n) {
		if(n<0) return -1;
		if(n == 0) return 1;
		else {
			return x * powerRecursive(x, n-1);
		}
	}
	/* Question: How to find Greatest Common Divisor of two numbers using recursion ?
	 */
	static int gcdRecursion (int num1, int num2) {
		if(num1<0 || num2<0) return -1;
		if(num2 == 0) return num1;
		else {
			return gcdRecursion(num2, num1%num2);
		}
	}
	/* Question: How to convert a number from Decimal to Binary using recursion ?
	 */
	static int decimalToBinaryRecursion(int num) {
		if(num == 0) {
			return 0;
		}
		else {
			return num%2 + 10 *decimalToBinaryRecursion(num/2);
		}
	}
}