package string;

public class KokoEatingBanana {

	
	 public static int findMax(int[] v) {
	        int maxi = Integer.MIN_VALUE;;
	        int n = v.length;
	        //find the maximum:
	        for (int i = 0; i < n; i++) {
	            maxi = Math.max(maxi, v[i]);
	        }
	        return maxi;
	    }

	    public static int calculateTotalHours(int[] v, int hourly) {
	        int totalH = 0;
	        int n = v.length;
	        //find total hours:
	        for (int i = 0; i < n; i++) {
	            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
	        }
	        return totalH;
	    }

	    public static int minimumRateToEatBananas(int[] v, int h) {
	        //Find the maximum number:
	        int maxi = findMax(v);

	        //Find the minimum value of k:
	        for (int i = 1; i <= maxi; i++) {
	            int reqTime = calculateTotalHours(v, i);
	            if (reqTime <= h) {
	                return i;
	            }
	        }

	        //dummy return statement
	        return maxi;
	    }

	    public static int findMax1(int[] v) {
	        int maxi = Integer.MIN_VALUE;;
	        int n = v.length;
	        //find the maximum:
	        for (int i = 0; i < n; i++) {
	            maxi = Math.max(maxi, v[i]);
	        }
	        return maxi;
	    }

	    public static int calculateTotalHours1(int[] v, int hourly) {
	        int totalH = 0;
	        int n = v.length;
	        //find total hours:
	        for (int i = 0; i < n; i++) {
	            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
	        }
	        return totalH;
	    }

	    public static int minimumRateToEatBananas1(int[] v, int h) {
	        int low = 1, high = findMax(v);

	        //apply binary search:
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            int totalH = calculateTotalHours(v, mid);
	            if (totalH <= h) {
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }
	        }
	        return low;
	    }

}
