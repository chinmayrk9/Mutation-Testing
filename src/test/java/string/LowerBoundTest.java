package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LowerBoundTest {

	LowerBound lowerBound=new LowerBound();
	
	@Test	
	public void testAnagram1() {
		 int[] nums = {1,3,6,9,10};
		assertEquals(1, lowerBound.lowerBound(nums,5,3));
		assertEquals(5, lowerBound.lowerBound(nums,5,11));
		assertEquals(1, lowerBound.lowerBound(nums,5,2));
		assertEquals(0, lowerBound.lowerBound(nums,5,0));
//		 int[] nums1 = {1};
//		assertEquals(0, lowerBound.lowerBound(nums1));
//		 int[] nums2 = {1,0};
//			assertEquals(0, lowerBound.lowerBound(nums2));
//			 int[] nums3 = {0,2,1};
//				assertEquals(1, lowerBound.lowerBound(nums3));

		//assertEquals(true, findPeakElement.findPeakElement());
		
	}
}
