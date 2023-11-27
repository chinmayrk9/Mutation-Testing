package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PascalTraingleTest {

	  @Test
	    public void testPascalTriangle() {
	 int r = 5; // row number
     int c = 3; // col number
  //   int element = pascalTriangle(r, c);
     assertEquals(15, PascalTriangle.pascalTriangle(7, 3));
     assertEquals(210, PascalTriangle.pascalTriangle(11, 5));
	  }
}
