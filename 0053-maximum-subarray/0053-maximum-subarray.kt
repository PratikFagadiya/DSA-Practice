class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = nums[0]
        var maxSum = nums[0]

        for(i in 1 until nums.size) {
            if(sum < 0) {
               sum = 0
            }

            sum = sum + nums[i]
            maxSum = Math.max(sum, maxSum)

        }

        return maxSum
    }
}