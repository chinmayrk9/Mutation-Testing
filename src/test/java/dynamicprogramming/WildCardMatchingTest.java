package dynamicprogramming;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WildCardMatchingTest {

    @Test
    public void testMatchingPattern() {
        assertTrue(WildcardMatching.isMatch("aa", "a*"));
        assertTrue(WildcardMatching.isMatch("adceb", "*a*b"));
    }

    @Test
    public void testNonMatchingPattern() {
        assertFalse(WildcardMatching.isMatch("cb", "?a"));
        assertFalse(WildcardMatching.isMatch("acdcb", "a*c?b"));
        assertFalse(WildcardMatching.isMatch("mississippi", "m*issi*iss?*i"));
    }

    @Test
    public void testEmptyPattern() {
        assertTrue(WildcardMatching.isMatch("", ""));
        assertFalse(WildcardMatching.isMatch("abc", ""));
    }
}
