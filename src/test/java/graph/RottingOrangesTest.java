package graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import graph.RottingOranges;

public class RottingOrangesTest {

	

    @Test
    public void hasSingleEggSingleFloor() {
     
    	 int arr[][]={ {2,1,1},{1,1,0},{0,1,1} };
    	 int arr1[][]={{2,1,1},{0,1,1},{1,0,1}};
    	 int arr2[][]={{0,2}};
     // int rotting = ;
        assertEquals(4, RottingOranges.orangesRotting(arr));
        assertEquals(-1, RottingOranges.orangesRotting(arr1));
        assertEquals(0, RottingOranges.orangesRotting(arr2));
    }
}
