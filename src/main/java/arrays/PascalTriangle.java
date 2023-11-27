package arrays;

public class PascalTriangle {

	 public static long nCr(int n, int r) {
	        long res = 1;

	        // calculating nCr:
	        for (int i = 0; i < r; i++) {
	            res = res * (n - i);
	            res = res / (i + 1);
	        }
	        return res;
	    }

	    public static int pascalTriangle(int r, int c) {
	        int element = (int) nCr(r - 1, c - 1);
	        return element;
	    }
}

