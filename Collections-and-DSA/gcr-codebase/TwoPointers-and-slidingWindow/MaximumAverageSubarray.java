class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {

            windowSum += nums[i];       // Add new element
            windowSum -= nums[i - k];   // Remove old element

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}