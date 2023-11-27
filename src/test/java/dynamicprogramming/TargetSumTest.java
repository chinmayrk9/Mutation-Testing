package dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TargetSumTest {

	@Test
	 public  void test1() {
	        int arr[] = { 1, 2, 3, 1 };
	        int target = 3;
	        int arr2[] = { 1,1,1,1, 1 };

	        int n = arr.length;

	       // // Call the targetSum function and print the result
	        assertEquals(2,  TargetSum.targetSum(4, target, arr));
	        assertEquals(5,  TargetSum.targetSum(5, target, arr2));
	        assertEquals(2,  TargetSum.targetSum1(4, target, arr));
	        assertEquals(5,  TargetSum.targetSum1(5, target, arr2));
	        
	    }
}
