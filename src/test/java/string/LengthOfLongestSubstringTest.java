package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LengthOfLongestSubstringTest {
    @Test
    public void testUsingSet() {
        assertEquals(3, LengthOfLongestSubstring.usingSet("abcabcbb"));
        assertEquals(1, LengthOfLongestSubstring.usingSet("bbbbb"));
        assertEquals(3, LengthOfLongestSubstring.usingSet("pwwkew"));
        assertEquals(0, LengthOfLongestSubstring.usingSet(""));
    }

    @Test
    public void testUsingMap() {
        assertEquals(3, LengthOfLongestSubstring.usingMap("abcabcbb"));
        assertEquals(1, LengthOfLongestSubstring.usingMap("bbbbb"));
        assertEquals(3, LengthOfLongestSubstring.usingMap("pwwkew"));
        assertEquals(0, LengthOfLongestSubstring.usingMap(""));
    }

    @Test
    public void testUsingArray() {
        assertEquals(3, LengthOfLongestSubstring.usingArray("abcabcbb"));
        assertEquals(1, LengthOfLongestSubstring.usingArray("bbbbb"));
        assertEquals(3, LengthOfLongestSubstring.usingArray("pwwkew"));
        assertEquals(0, LengthOfLongestSubstring.usingArray(""));
    }
}
