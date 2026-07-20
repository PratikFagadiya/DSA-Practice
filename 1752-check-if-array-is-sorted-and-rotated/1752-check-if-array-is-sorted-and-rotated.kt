class Solution {
    fun check(nums: IntArray): Boolean {
         var rotatedCounter = 0

        for (i in 1 until nums.size) {
            if (nums[i - 1] > nums[i]) {
                rotatedCounter++
            }
        }

        if (nums[nums.size - 1] > nums[0]) {
            rotatedCounter++
        }

        return rotatedCounter <= 1
    }
}