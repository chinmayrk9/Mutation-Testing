package dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EggDroppingTest {

	  @Test
	   public void hasMultipleEggSingleFloor() {
	        assertEquals(1, EggDropping.minTrials(3, 1));
	    }

	    @Test
	    public void hasSingleEggSingleFloor() {
	        assertEquals(1, EggDropping.minTrials(1, 1));
	    }

	    @Test
	    public void hasSingleEggMultipleFloor() {
	        assertEquals(3, EggDropping.minTrials(1, 3));
	    }

	    @Test
	    public void hasMultipleEggMultipleFloor() {
	        assertEquals(7, EggDropping.minTrials(100, 101));
	    }
}
