package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountInversionsTest {

	@Test
	public  void test() {
    
        
     // Test case with no inversions
        int[] arr1 = {1, 2, 3, 4, 5};
        assertEquals(0, CountInversions.numberOfInversions(arr1, arr1.length));

        // Test case with one inversion
        int[] arr2 = {1, 3, 2, 4, 5};
        assertEquals(1, CountInversions.numberOfInversions(arr2, arr2.length));

        // Test case with multiple inversions
        int[] arr3 = {5, 4, 3, 2, 1};
        assertEquals(10, CountInversions.numberOfInversions(arr3, arr3.length));

        // Test case with duplicate elements
        int[] arr4 = {2, 4, 3, 2, 1, 5};
        assertEquals(7, CountInversions.numberOfInversions(arr4, arr4.length));
        
      
        assertEquals(0, CountInversions.numberOfInversions1(arr3, arr3.length));

      
}
}

