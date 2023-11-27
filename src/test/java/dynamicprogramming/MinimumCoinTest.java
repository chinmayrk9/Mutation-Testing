package dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumCoinTest {

	@Test
	 public void test() {
	        int arr[] = { 1, 2, 3 };
	        int arr2[]= {2};
	        int T = 7;

	        // Call the minimumElements function and print the result
	        assertEquals(3, MinimumCoin.minimumElements(arr, T));
	        assertEquals(-1, MinimumCoin.minimumElements(arr2, 3));
	        
	        assertEquals(3, MinimumCoin.minimumElements1(arr, T));
	        assertEquals(-1, MinimumCoin.minimumElements1(arr2, 3));
	        
	        assertEquals(3, MinimumCoin.minimumElements2(arr, T));
	        assertEquals(-1, MinimumCoin.minimumElements2(arr2, 3));
	    }
}
