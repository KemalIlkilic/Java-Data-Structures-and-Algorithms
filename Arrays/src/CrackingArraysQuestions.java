public class CrackingArraysQuestions {
	/*Find the missing number in an integer array of 1 to 10.
	 int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
	 missingNumber(intArray); // 7
	 */
	public void missingNumber(int[] intArray) {
		int sum = 0;
		for(int i = 0;i<intArray.length;i++){
			sum += intArray[i];
		}
		System.out.print(55-sum);
	}
	/*
	 * Write a program to find all pairs of integers whose sum is equal to a given number.
	 * Input: nums = [2,7,11,15], target = 9
	 * Output: [0,1]
	 * Output: Because nums[0] + nums[1] == 9, we return [0, 1]
	 * Input: nums = [3,2,4], target = 6
	 * Output: [1,2]
	 */
	public int[] twoSum(int[] nums, int target) {
		for(int i = 0;i<nums.length;i++) {
			for(int j = i+1;j<nums.length;j++) {
				if (nums[i]+nums[j] == target) {
					return new int[] {i,j};
				}	
			}
		}
		return new int[] {};
	}
	/*
	 * Write a program to to check if an array contains a number in Java.
	 * int[] intArray = {1,2,3,4,5,6};
	 * searchInArray(intArray, 6); // 5
	 */
    public int searchInArray(int[] intArray, int valueToSearch) {
        for(int i = 0; i<intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                return i;
            }
        }
        return -1;
    }
    /*How to find maximum product of two integers in the array where all elements are positive.
     * maxProduct(intArray) // (40,50)
     * int[] intArray = {10,20,30,40,50};
     */
    public String maxProduct(int[] intArray) {
    	int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i<intArray.length; i++) {
          for (int j = i+1; j<intArray.length; j++) {
            if (intArray[i]*intArray[j]>maxProduct) {
              maxProduct = intArray[i]*intArray[j];
              pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
            }
          }
        }
        return pairs;
        }
    /*Write a program to check if an array is unique or not.
     * int[] intArray = {1,2,3,4,5,6};
     * isUnique(intArray) // true
     */
    public boolean isUnique(int[] intArray) {
        for (int i =0; i<intArray.length; i++) {
            for (int j = i+1; j<intArray.length; j++) {
              if (intArray[i] == intArray[j]) {
                return false;
              }
            }
          }
          return true;
    }
    /*
     * Rotate Image -LeetCode
     */
    public void transpose(int[][] matrix) {
    	int n = matrix.length;
    	for(int i = 0;i<n-1;i++) {
    		for(int j = i+1;j<n;j++) {
    			int temp = matrix[j][i];
    			matrix[j][i] = matrix[i][j];
    			matrix[i][j] = temp;	
    		}
    	}
    }
    public void reflect(int[][] matrix) {
    	int n = matrix.length;
    	for(int i = 0;i<n;i++) {
    		for(int j = 0;j<n/2;j++) {
    			int temp = matrix[i][n-1-j];
    			matrix[i][n-1-j] = matrix[i][j];
    			matrix[i][j] = temp;
    		}
    	}
    }
    /*
     * Write a function to find the duplicate number on given integer array.
     * removeDuplicates({1, 1, 2, 2, 3, 4, 5})
     * Output : [1, 2, 3, 4, 5] = 5
     */
    public int removeDuplicates(int[] nums) {
    	int j = 1;
    	for(int i = 0;i<nums.length-1;i++) {
    		if(nums[i] != nums[i+1]) {
    			nums[j] = nums[i+1];
    			j++;
    		}
    	}
    	return j;
    }



    
}
