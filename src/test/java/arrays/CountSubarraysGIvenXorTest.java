package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountSubarraysGIvenXorTest {

	  @Test
	    public void testCountSubarraysGIvenXor() {
	        // Test case with multiple subarrays with XOR equal to k
	        int[] arr1 = {1, 2, 3, 4, 5};
	        assertEquals(2, CountSubarraysGIvenXor.subarraysWithXorK1(arr1, 5));

	        // Test case with all elements being the same
	        int[] arr2 = {4, 4, 4, 4, 4};
	        assertEquals(0, CountSubarraysGIvenXor.subarraysWithXorK(arr2, 8));

	        // Test case with no subarrays having XOR equal to k
	        int[] arr3 = {5, 6, 7, 8, 9};
	        assertEquals(2, CountSubarraysGIvenXor.subarraysWithXorK(arr3, 5));

	        // Test case with an empty array
	        int[] arr4 = {};
	        assertEquals(0, CountSubarraysGIvenXor.subarraysWithXorK(arr4, 0));

	        // Test case with a single-element array
	        int[] arr5 = {7};
	        assertEquals(1, CountSubarraysGIvenXor.subarraysWithXorK1(arr5, 7));

	        // Test case with k equal to 0
	        int[] arr6 = {1, 2, 3, 4, 5};
	        assertEquals(2, CountSubarraysGIvenXor.subarraysWithXorK1(arr6, 0));
	    }
}
