class Solution {
    fun missingNumber(nums: IntArray): Int {
      val n = nums.size
      val totalSum = n * (n + 1 ) / 2
      var sum = 0;
      for(i in 0 until n) {
        sum = sum + nums[i]
      }

      return totalSum - sum
    }
}