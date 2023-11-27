package arrays;

public class MaximumProductSubarray {

	static int maxProductSubArray(int arr[]) {
	    int result = Integer.MIN_VALUE;
	    for(int i=0;i<arr.length-1;i++) 
	        for(int j=i+1;j<arr.length;j++) {
	            int prod = 1;
	            for(int k=i;k<=j;k++) 
	                prod *= arr[k];
	            result = Math.max(result,prod);
	        }
	   return result;     
	}
	
	static int maxProductSubArray1(int arr[]) {
	    int result = arr[0];
	    for(int i=0;i<arr.length-1;i++) {
	        int p = arr[i];
	        for(int j=i+1;j<arr.length;j++) {
	            result = Math.max(result,p);
	            p *= arr[j];
	        }
	        result = Math.max(result,p);
	    }
	   return result;     
	}
	
	 public static int maxProductSubArray2(int[] arr) {
	        int n = arr.length; //size of array.

	        int pre = 1, suff = 1;
	        int ans = Integer.MIN_VALUE;
	        for (int i = 0; i < n; i++) {
	            if (pre == 0) pre = 1;
	            if (suff == 0) suff = 1;
	            pre *= arr[i];
	            suff *= arr[n - i - 1];
	            ans = Math.max(ans, Math.max(pre, suff));
	        }
	        return ans;
	    }
	
}
