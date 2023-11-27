package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UpperBoundTest {

	
	
	@Test	
	public void testAnagram2() {
		 int[] nums = {1,3,6,9,10};
		assertEquals(2, UpperBound.upperBound(nums,5,3));
		assertEquals(2, UpperBound.upperBound(nums,5,10));
		assertEquals(2, UpperBound.upperBound(nums,5,2));
		assertEquals(0, UpperBound.upperBound(nums,5,0));
//		 int[] nums1 = {1};
//		assertEquals(0, lowerBound.lowerBound(nums1));
//		 int[] nums2 = {1,0};
//			assertEquals(0, lowerBound.lowerBound(nums2));
//			 int[] nums3 = {0,2,1};
//				assertEquals(1, lowerBound.lowerBound(nums3));

		//assertEquals(true, findPeakElement.findPeakElement());
		
	}
}
