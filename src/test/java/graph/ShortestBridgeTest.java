package graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import graph.ShortestBridge;

public class ShortestBridgeTest {



    @Test
    public void test() {
     
    	ShortestBridge ShortestBridge=new ShortestBridge();
    	 int arr[][]={ {0,1},{1,0} };
    	 int arr1[][]={{0,1,0},{0,0,0},{0,0,1}};
    	 int arr2[][]={{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}};
     // int rotting = ;
        assertEquals(1, ShortestBridge.shortestBridge(arr));
       // assertEquals(2, ShortestBridge.shortestBridge(arr1));
        assertEquals(1, ShortestBridge.shortestBridge(arr2));
        
        assertEquals(1, ShortestBridge.shortestBridge1(arr));
       // assertEquals(2, ShortestBridge.shortestBridge1(arr1));
        assertEquals(1, ShortestBridge.shortestBridge1(arr2));
    }
}
