package dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbStairsTest {
	@Test
   public void climbStairsTestForTwo() {
        assertEquals(2, ClimbingStairs.numberOfWays(2));
    }

    @Test
    public  void climbStairsTestForZero() {
        assertEquals(0, ClimbingStairs.numberOfWays(0));
    }

    @Test
    public void climbStairsTestForOne() {
        assertEquals(1, ClimbingStairs.numberOfWays(1));
    }

    @Test
    public  void climbStairsTestForFive() {
        assertEquals(8, ClimbingStairs.numberOfWays(5));
    }

    @Test
    public void climbStairsTestForThree() {
        assertEquals(3, ClimbingStairs.numberOfWays(3));
    }

}
