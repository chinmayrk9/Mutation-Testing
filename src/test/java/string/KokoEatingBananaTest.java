package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KokoEatingBananaTest {

	@Test
	  public  void test() {
	        int[] v = {7, 15, 6, 3};
	        int h = 8;
	        assertEquals(5, KokoEatingBanana.minimumRateToEatBananas(v, h));
	        int vv[] = {30,11,23,4,20};
	        	int hh = 6;
	        	
	        assertEquals(23, KokoEatingBanana.minimumRateToEatBananas(vv, hh));
	        
	        assertEquals(5, KokoEatingBanana.minimumRateToEatBananas1(v, h));
	        assertEquals(23, KokoEatingBanana.minimumRateToEatBananas1(vv, hh));
	     //   System.out.println("Koko should eat at least " + ans + " bananas/hr.");
	    }
}
