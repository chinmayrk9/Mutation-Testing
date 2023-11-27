package trie;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberofDistinctSubstringTest {

	@Test
	public  void main() {

		NumberofDistinctSubstring numberofDistinctSubstring=new NumberofDistinctSubstring();
	    String s1 = "ababa";
	    assertEquals(10, 
	    		numberofDistinctSubstring.countDistinctSubstrings(s1));

	    String s2 = "ccfdf";
	    assertEquals(14,
	    		numberofDistinctSubstring.countDistinctSubstrings(s2));

	  }
}
