package string;

public class MaxConsecutiveOnes {
    // Approach-1 (Simple trick)
    public static int findMaxConsecutiveOnesApproach1(int[] nums) {
        int n = nums.length;
        int[] ones = new int[n];

        int count = 0;
        // Count 1s to the left of a 0
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                ones[i] = count;
                count = 0;
            } else {
                count++;
            }
        }

        count = 0;
        int result = 0;
        // Count ones to the right of a 0 and find the result at the same time
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                ones[i] += count;
                result = Math.max(result, ones[i] + 1); // What if I convert this 0 to one (so adding 1)
                count = 0;
            } else {
                count++;
            }
        }

        return result;
    }

    // Approach-2 (Using 2 pointer technique but slight improvement)
    public static int findMaxConsecutiveOnesApproach2(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        int count = 0;
        int result = 0;
        while (i < n) {
            if (nums[i] == 0) {
                count++;
            }
            if (count > 1) { // here, k = 1
                count -= nums[j] == 0 ? 1 : 0; // We can decrement 0 only if we reject 0 from left window boundary
                j++; // This will anyway increase
            }
            result = Math.max(result, i - j + 1);
            i++;
        }
        return result;
    }
}
