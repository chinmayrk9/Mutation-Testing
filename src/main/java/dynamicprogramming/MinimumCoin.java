package dynamicprogramming;

import java.util.Arrays;

public class MinimumCoin {
	 public static int minimumElementsUtil(int[] arr, int ind, int T, int[][] dp) {
	        // Base case: If the current index is 0
	        if (ind == 0) {
	            // If T is divisible by the first element of the array, return the quotient
	            if (T % arr[0] == 0)
	                return T / arr[0];
	            else
	                // If not, return a large value to indicate it's not possible
	                return (int) Math.pow(10, 9);
	        }

	        // If the result for this subproblem has already been calculated, return it
	        if (dp[ind][T] != -1)
	            return dp[ind][T];

	        // Calculate the minimum number of elements needed without taking the current element
	        int notTaken = 0 + minimumElementsUtil(arr, ind - 1, T, dp);

	        // Initialize the minimum number of elements needed taking the current element
	        int taken = (int) Math.pow(10, 9);

	        // If the current element is less than or equal to T, calculate the minimum taking it
	        if (arr[ind] <= T)
	            taken = 1 + minimumElementsUtil(arr, ind, T - arr[ind], dp);

	        // Store the minimum result in the dp array and return it
	        return dp[ind][T] = Math.min(notTaken, taken);
	    }

	    // Function to find the minimum number of elements to achieve the target sum
	   public static int minimumElements(int[] arr, int T) {
	        int n = arr.length;

	        // Create a 2D array to store results of subproblems
	        int[][] dp = new int[n][T + 1];

	        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
	        for (int row[] : dp)
	            Arrays.fill(row, -1);

	        // Calculate the minimum number of elements to achieve the target sum
	        int ans = minimumElementsUtil(arr, n - 1, T, dp);

	        // If it's not possible to achieve the target sum, return -1
	        if (ans >= (int) Math.pow(10, 9))
	            return -1;
	        return ans;
	    }
	    
	   public static int minimumElements1(int[] arr, int T) {
	        int n = arr.length;

	        // Create a 2D array to store results of subproblems
	        int dp[][] = new int[n][T + 1];

	        // Initialize the dp array for the first element of the array
	        for (int i = 0; i <= T; i++) {
	            if (i % arr[0] == 0)
	                dp[0][i] = i / arr[0];
	            else
	                dp[0][i] = (int) Math.pow(10, 9);
	        }

	        // Fill the dp array using dynamic programming
	        for (int ind = 1; ind < n; ind++) {
	            for (int target = 0; target <= T; target++) {
	                int notTake = 0 + dp[ind - 1][target];
	                int take = (int) Math.pow(10, 9);

	                // If the current element is less than or equal to the target, calculate 'take'
	                if (arr[ind] <= target)
	                    take = 1 + dp[ind][target - arr[ind]];

	                // Store the minimum result in the dp array
	                dp[ind][target] = Math.min(notTake, take);
	            }
	        }

	        // Get the minimum number of elements needed for the target sum
	        int ans = dp[n - 1][T];

	        // If it's not possible to achieve the target sum, return -1
	        if (ans >= (int) Math.pow(10, 9))
	            return -1;
	        return ans;
	    }
	   
	 public  static int minimumElements2(int[] arr, int T) {
	        int n = arr.length;

	        // Create two arrays to store results of subproblems: prev and cur
	        int prev[] = new int[T + 1];
	        int cur[] = new int[T + 1];

	        // Initialize the prev array for the first element of the array
	        for (int i = 0; i <= T; i++) {
	            if (i % arr[0] == 0)
	                prev[i] = i / arr[0];
	            else
	                prev[i] = (int) Math.pow(10, 9);
	        }

	        // Fill the cur array using dynamic programming
	        for (int ind = 1; ind < n; ind++) {
	            for (int target = 0; target <= T; target++) {
	                int notTake = 0 + prev[target];
	                int take = (int) Math.pow(10, 9);

	                // If the current element is less than or equal to the target, calculate 'take'
	                if (arr[ind] <= target)
	                    take = 1 + cur[target - arr[ind]];

	                // Store the minimum result in the cur array
	                cur[target] = Math.min(notTake, take);
	            }

	            // Update prev with cur for the next iteration
	            prev = cur.clone();
	        }

	        // Get the minimum number of elements needed for the target sum
	        int ans = prev[T];

	        // If it's not possible to achieve the target sum, return -1
	        if (ans >= (int) Math.pow(10, 9))
	            return -1;
	        return ans;
	    }

}

