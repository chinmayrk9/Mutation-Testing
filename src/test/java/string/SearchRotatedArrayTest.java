package string;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SearchRotatedArrayTest {

	@Test	
	public void testAnagram1() {
		 
		 ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(9,10,15,18,36,1,3,6,7,8));
		assertEquals(true, SearchRotatedArray.search(nums,10,3));
		assertEquals(false, SearchRotatedArray.search(nums,10,11));
		assertEquals(false, SearchRotatedArray.search(nums,10,2));
		assertEquals(true, SearchRotatedArray.search(nums,10,9));
		assertEquals(true, SearchRotatedArray.search(nums,10,10));
		assertEquals(true, SearchRotatedArray.search(nums,10,1));
		assertEquals(true, SearchRotatedArray.search(nums,10,6));
		assertEquals(true, SearchRotatedArray.search(nums,10,15));
		assertEquals(true, SearchRotatedArray.search(nums,10,18));
		assertEquals(true, SearchRotatedArray.search(nums,10,36));
		assertEquals(false, SearchRotatedArray.search(nums,10,100));
		assertEquals(false, SearchRotatedArray.search(nums,10,0));
		
//		 int[] nums1 = {1};
//		assertEquals(0, lowerBound.lowerBound(nums1));
//		 int[] nums2 = {1,0};
//			assertEquals(0, lowerBound.lowerBound(nums2));
//			 int[] nums3 = {0,2,1};
//				assertEquals(1, lowerBound.lowerBound(nums3));

		//assertEquals(true, findPeakElement.findPeakElement());
		
	}
}
