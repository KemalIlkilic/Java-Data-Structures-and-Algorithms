public class Recursion_Problems {
	/* Write a function called power which accepts a base and an exponent. 
	 * The function should return the power of the base to the exponent. 
	 * This function should mimic the functionality of math.pow() - do not worry about negative bases and exponents.
	 */
    public int power(int base, int exponent) {
        if( exponent == 0){
            return 1;
        }
        else {
            return (base * power(base, exponent-1));
        }
    }
    /*
     * Write a function factorial which accepts a number and returns the factorial of that number.
     * A factorial is the product of an integer and all the integers below it; e.g., factorial four ( 4! ) is equal to 24
     * because 4 * 3 * 2 * 1 equals 24. factorial zero (0!) is always 1.
     */
    public int factorial(int n) {
    	if(n==0 || n==1) return 1;
    	else {
    		return n * factorial(n-1);
    	}
    }
    /*
     * Write a function called productOfArray which takes in an array of numbers and returns the product of them all.
     * int arr[] = { 1, 2, 3, 4, 5 }; 
     * productofArray(arr, arr.length); #120
     */
    public int productofArray(int[]arr,int n) {
    	if(n==1) return arr[0];
    	else {
    		return arr[n-1] * productofArray(arr, n-1);
    	}
    }
    /*
     * Write a function called recursiveRange which accepts a number and adds up all the numbers
     * from 0 to the number passed to the function.
     * recursiveRange(6)  // 21
     * recursiveRange(10) // 55 
     */
    public int recursiveRange(int n) {
    	if(n==1) return 1;
    	else {
    		return n + recursiveRange(n-1);
    	}
    }
    /*
     * Write a recursive function called fib which accepts a number and returns the nth number in the Fibonacci sequence.
     * Recall that the Fibonacci sequence is the sequence of whole numbers 0,1, 1, 2, 3, 5, 8, ...
     * which starts with 0 and 1, and where every number thereafter is equal to the sum of the previous two numbers.
     * fib(4) # 3
     * fib(10) # 55
     * fib(28) # 317811
     * fib(35) # 9227465
     */
    public int fib(int n) {
    	if(n == 1 || n == 2) return 1;
    	else return fib(n-2) + fib(n-1);
    }
}
