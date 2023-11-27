package string;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Search2DMatrixTest {

	@Test
	 public  void test() {
	        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
	        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
	        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
	        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

	        assertTrue(Search2DMatrix.searchMatrix(matrix, 8));
	  
	        
	        assertTrue(Search2DMatrix.searchMatrix1(matrix, 8));
	     
	        
	        assertTrue(Search2DMatrix.searchMatrix2(matrix, 8));
	     
	        ArrayList<ArrayList<Integer>> singleColumnMatrix = new ArrayList<>();
	        singleColumnMatrix.add(new ArrayList<>(List.of(1)));
	        singleColumnMatrix.add(new ArrayList<>(List.of(2)));
	        singleColumnMatrix.add(new ArrayList<>(List.of(3)));
	        singleColumnMatrix.add(new ArrayList<>(List.of(4)));
	        assertTrue(Search2DMatrix.searchMatrix(singleColumnMatrix, 3));
	        assertFalse(Search2DMatrix.searchMatrix(singleColumnMatrix, 5));
	        
	        assertTrue(Search2DMatrix.searchMatrix1(singleColumnMatrix, 3));
	    
	        
	        assertTrue(Search2DMatrix.searchMatrix2(singleColumnMatrix, 3));
	        assertFalse(Search2DMatrix.searchMatrix2(singleColumnMatrix, 5));
	        
	        
	  

	      
	       
	     
	    }
}
