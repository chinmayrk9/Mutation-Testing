package dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuySellStockTest {

	
	@Test
	 public void test() {

		int n = 6;
        long[] arr = {7, 1, 5, 3, 6, 4};
        long[] arr2= {7,6,4,3,1};
	        int T = 7;

	        // Call the minimumElements function and print the result
	        assertEquals(7, BuySellStock.getMaximumProfit(arr, n));
	        assertEquals(0, BuySellStock.getMaximumProfit(arr2, 5));
	        
	        assertEquals(7, BuySellStock.getMaximumProfit1(arr, n));
	        assertEquals(0, BuySellStock.getMaximumProfit1(arr2, 5));
	        
	        assertEquals(7, BuySellStock.getMaximumProfit2(arr, n));
	        assertEquals(0, BuySellStock.getMaximumProfit2(arr2, 5));
	    }
}
