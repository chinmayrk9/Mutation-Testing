package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringTest {

	

	    @Test
	    public void hasSingleEggSingleFloor() {
	     
	        assertEquals(0, LongestSubstring.solve(""));
	        assertEquals(1, LongestSubstring.solve("aaaaa"));
	        assertEquals(5, LongestSubstring.solve("abcde"));
	    }
	    
	    @Test
	    public void hasSingleEggSingleFloor1() {
	     
	        assertEquals(0, LongestSubstring.solve2(""));
	        assertEquals(1, LongestSubstring.solve2("aaaaa"));
	        assertEquals(5, LongestSubstring.solve2("abcde"));
	    }
	    @Test
	    public void hasSingleEggSingleFloor2() {
	     
	        assertEquals(0, LongestSubstring.solve3(""));
	        assertEquals(1, LongestSubstring.solve3("aaaaa"));
	        assertEquals(5, LongestSubstring.solve3("abcde"));
	    }

}
