package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterReplacementTest {
    CharacterReplacement cr = new CharacterReplacement();
    @Test
    public void testBruteForce() {
        assertEquals(4, cr.crBrute("ABAB", 2));
        assertEquals(4, cr.crBrute("AABABBA", 1));
        // assertEquals(7, cr.crBrute("AAABBB", 0));
        // assertEquals(2, cr.crBrute("AA", 2));
    }

    @Test
    public void testBetterApproach() {
        assertEquals(4, cr.crBetter("ABAB", 2));
        assertEquals(4, cr.crBetter("AABABBA", 1));
        // assertEquals(7, cr.crBetter("AAABBB", 0));
        // assertEquals(2, cr.crBetter("AA", 2));
    }

    @Test
    public void testOptimalApproach() {
        assertEquals(4, CharacterReplacement.crOptimal("ABAB", 2));
        assertEquals(4, CharacterReplacement.crOptimal("AABABBA", 1));
        // assertEquals(7, CharacterReplacement.crOptimal("AAABBB", 0));
        // assertEquals(2, CharacterReplacement.crOptimal("AA", 2));
    }

    // @Test
    // public void testEmptyString() {
    //     assertEquals(0, CharacterReplacement.crBrute("", 2));
    //     assertEquals(0, CharacterReplacement.crBetter("", 1));
    //     assertEquals(0, CharacterReplacement.crOptimal("", 0));
    // }

    // @Test
    // public void testAllSameCharacters() {
    //     assertEquals(5, CharacterReplacement.crBrute("AAAAA", 2));
    //     assertEquals(5, CharacterReplacement.crBetter("AAAAA", 1));
    //     assertEquals(5, CharacterReplacement.crOptimal("AAAAA", 0));
    // }
}
