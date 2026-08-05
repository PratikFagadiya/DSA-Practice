class Solution {
    fun sortColors(nums: IntArray): Unit {

        var mid = 0
        var start = 0
        var end = nums.size - 1

        while(mid <= end) {

            if(nums[mid] == 0) {
                // Swap start and mid and increase start and mid
                swapValue(nums, start, mid)
                start++
                mid++
            } else if(nums[mid] == 1) {
                // Increase only mid because mid is already at middle
                mid++
            } else {
                // Swap mid and end and decrase end
                swapValue(nums, mid, end)
                end--
            }


        }
        
    }

    private fun swapValue(nums: IntArray, leftIndex : Int, rightIndex : Int, ) {
        val temp = nums[leftIndex]
        nums[leftIndex] = nums[rightIndex]
        nums[rightIndex] = temp
    }
}