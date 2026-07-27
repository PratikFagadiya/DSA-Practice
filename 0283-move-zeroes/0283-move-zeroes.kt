class Solution {
    fun moveZeroes(nums: IntArray): Unit {

        if(nums.size < 1) {
            return
        }

        var zeroIndex = Integer.MIN_VALUE

        for(i in 0 until nums.size) {
            if(nums[i] == 0) {
                zeroIndex = i
                break
            }
        }

        if(zeroIndex == Integer.MIN_VALUE) {
            return
        }

        for(i in zeroIndex until nums.size) {
            if(nums[i] != 0) {
                swapValue(nums, zeroIndex, i)        
                zeroIndex++    
            }
        }

    }

    fun swapValue(nums: IntArray, zeroIndex : Int, swappingIndex : Int) {
        // val tempValue = nums[zeroIndex]
        nums[zeroIndex] = nums[swappingIndex]
        nums[swappingIndex] = 0
    }
}