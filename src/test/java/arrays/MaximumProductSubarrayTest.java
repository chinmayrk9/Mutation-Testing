package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumProductSubarrayTest {

	  @Test
	    public void testMaxProductSubArray() {
    int[] arr1 = {1, 2, 3, 4};
    assertEquals(24, MaximumProductSubarray.maxProductSubArray(arr1));

    // Test case with both positive and negative numbers
    int[] arr2 = {2, 3, -2, 4, -1};
    assertEquals(48, MaximumProductSubarray.maxProductSubArray(arr2));

    // Test case with all negative numbers
    int[] arr3 = {-2, -3, -4, -2, -1};
    assertEquals(48, MaximumProductSubarray.maxProductSubArray1(arr3));

    // Test case with a single element
    int[] arr4 = {5};
    assertEquals(5, MaximumProductSubarray.maxProductSubArray1(arr4));

   

    // Test case with zero
    int[] arr6 = {0, 2, 3, 4};
    assertEquals(24, MaximumProductSubarray.maxProductSubArray2(arr6));

   
}
}
