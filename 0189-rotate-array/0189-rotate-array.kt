class Solution {

    fun rotate(nums: IntArray, k: Int): Unit {
        
        val k = k % nums.size
        swapValue(nums, 0, nums.size- k - 1)
        swapValue(nums, nums.size - k , nums.size - 1)
        swapValue(nums, 0 , nums.size -1)
        return
    }

   fun swapValue(nums: IntArray, start: Int, end: Int) {
    var left = start
    var right = end

    while (left < right) {
        val temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp

        left++
        right--
    }
   }

}