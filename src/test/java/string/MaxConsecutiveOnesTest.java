package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxConsecutiveOnesTest {
    @Test
    public void testApproach1() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        assertEquals(4, MaxConsecutiveOnes.findMaxConsecutiveOnesApproach1(nums));
    }

    @Test
    public void testApproach2() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        assertEquals(4, MaxConsecutiveOnes.findMaxConsecutiveOnesApproach2(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertEquals(0, MaxConsecutiveOnes.findMaxConsecutiveOnesApproach1(nums));
        assertEquals(0, MaxConsecutiveOnes.findMaxConsecutiveOnesApproach2(nums));
    }
}
