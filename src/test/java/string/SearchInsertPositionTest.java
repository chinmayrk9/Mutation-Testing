package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertPositionTest {

	@Test	
	public void testAnagram3() {
		 int[] nums = {1,2,3,4,5,6,7,8,9,10,15};
		assertEquals(0, SearchInsertPosition.searchInsert(nums,1));
		assertEquals(10, SearchInsertPosition.searchInsert(nums,15));
		assertEquals(11, SearchInsertPosition.searchInsert(nums,19));
		assertEquals(0, SearchInsertPosition.searchInsert(nums,0));

		//assertEquals(true, findPeakElement.findPeakElement());
		
	}
}
