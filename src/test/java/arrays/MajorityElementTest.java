package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MajorityElementTest {

	  @Test
	    public void testMajorityElement() {
	int[] arr1 = {2, 2, 3, 2, 4, 2, 2, 5};
    assertEquals(2, MajorityElement.majorityElement(arr1));

    // Test case with no majority element
    int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
    assertEquals(-1, MajorityElement.majorityElement(arr2));

    // Test case with an empty array
    int[] arr3 = {};
    assertEquals(-1, MajorityElement.majorityElement(arr3));

    // Test case with a single-element array
    int[] arr4 = {7};
    assertEquals(7, MajorityElement.majorityElement1(arr4));

    // Test case with a majority element at the beginning
    int[] arr5 = {3, 3, 2, 2, 3, 3, 4, 5};
    assertEquals(-1, MajorityElement.majorityElement1(arr5));
}
}