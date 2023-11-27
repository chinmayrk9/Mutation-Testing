package graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import graph.MaxAreaIsland;

public class MaxAreaIslandTest {


    @Test
    public void test() {
     
    	MaxAreaIsland ShortestBridge=new MaxAreaIsland();
    	 int arr[][]={{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0} };
    	 int arr1[][]={{0,0,0,0,0,0,0,0}};
    	 int arr2[][]={{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}};
    
        assertEquals(6, ShortestBridge.maxAreaOfIsland(arr));
       assertEquals(0, ShortestBridge.maxAreaOfIsland(arr1));
        assertEquals(16, ShortestBridge.maxAreaOfIsland(arr2));
        
        assertEquals(6, ShortestBridge.maxAreaOfIsland1(arr));
        assertEquals(0, ShortestBridge.maxAreaOfIsland(arr1));
        assertEquals(16, ShortestBridge.maxAreaOfIsland1(arr2));
    }
}
