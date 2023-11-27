package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReversePairsTest {

	

	    @Test
	    public void testReversePairs() {
	        // Test case with no pairs
	        int[] skill1 = {1, 2, 3, 4, 5};
	        assertEquals(0, ReversePairs.team(skill1, skill1.length));

	        // Test case with one pair
	        int[] skill2 = {1, 2, 6, 3, 4};
	        assertEquals(0, ReversePairs.team(skill2, skill2.length));

	        // Test case with multiple pairs
	        int[] skill3 = {8, 4, 6, 2, 10};
	        assertEquals(2, ReversePairs.team(skill3, skill3.length));

	        // Test case with no elements
	        int[] skill4 = {};
	        assertEquals(0, ReversePairs.team(skill4, skill4.length));

	        // Test case with a single-element array
	        int[] skill5 = {7};
	        assertEquals(0, ReversePairs.team(skill5, skill5.length));

	        // Test case with duplicate elements
	        int[] skill6 = {5, 3, 7, 3, 1};
	        assertEquals(5, ReversePairs.team(skill6, skill6.length));
	        
	      //  int[] skill3 = {8, 4, 6, 2, 10};
	        assertEquals(0, ReversePairs.team1(skill3, skill3.length));

	        // Test case with no elements
	        //int[] skill4 = {};
	        assertEquals(0, ReversePairs.team1(skill4, skill4.length));

	        // Test case with a single-element array
	       // int[] skill5 = {7};
	        assertEquals(0, ReversePairs.team1(skill5, skill5.length));

	     
	    
	}
}
