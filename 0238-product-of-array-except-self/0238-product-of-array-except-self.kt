class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var prefix = 1
        var suffix = 1
        val result = IntArray(nums.size)

        for(i in 0 until nums.size) {
            result[i] = prefix
            prefix = prefix * nums[i]
        }

        for(i in nums.size - 1 downTo 0) {
            result[i] = result[i] * suffix
            suffix = suffix * nums[i]
        }

        return result
    }
}