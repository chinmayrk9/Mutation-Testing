package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindPeakELementTest {

	FindPeakElement findPeakElement=new FindPeakElement();
	
	@Test	
	public void testAnagram1() {
		 int[] nums = {1,2,3,4,5,6,7,8,9,10,15,12,6,4,3,6,2,1,2,1};
		assertEquals(10, findPeakElement.findPeakElement(nums));
		 int[] nums1 = {1};
		assertEquals(0, findPeakElement.findPeakElement(nums1));
		 int[] nums2 = {1,0};
			assertEquals(0, findPeakElement.findPeakElement(nums2));
			 int[] nums3 = {0,2,1};
				assertEquals(1, findPeakElement.findPeakElement(nums3));

		//assertEquals(true, findPeakElement.findPeakElement());
		
	}
}
