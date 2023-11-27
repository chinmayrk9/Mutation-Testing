package dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChangeTest {

	@Test
	 public  void test1() {
	        int arr[] = { 1, 2, 3 };
	        int target = 4;
	        int n = arr.length;
	        int arr2[]= {2};

	        // Call the countWaysToMakeChange function and print the result
	        assertEquals(4,CoinChange.countWaysToMakeChange(arr, n, target));
	        assertEquals(0,CoinChange.countWaysToMakeChange(arr2, arr2.length, 3));
	        
	        assertEquals(4,CoinChange.countWaysToMakeChange1(arr, n, target));
	        assertEquals(0,CoinChange.countWaysToMakeChange2(arr2, arr2.length, 3));
	        
	        assertEquals(4,CoinChange.countWaysToMakeChange1(arr, n, target));
	        assertEquals(0,CoinChange.countWaysToMakeChange2(arr2, arr2.length, 3));
	    }
}
