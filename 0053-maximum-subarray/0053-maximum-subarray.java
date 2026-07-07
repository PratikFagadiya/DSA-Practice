class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxSum =  nums[0];

        for(int i = 0; i < nums.length ; i++) {

            // Do total Sum 
            sum = nums[i] + sum;

            // Keep track which number is max number and store it
            maxSum = Math.max(sum, maxSum);

             // If sum is minus then make it 0
            if(sum < 0) {
                sum = 0;
            }

        }

        return maxSum;

    }
}