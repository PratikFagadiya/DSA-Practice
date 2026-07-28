class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 1

        for(i in 1 until nums.size) {
            if(nums[k - 1] != nums[i]) {
               nums[k] = nums[i]
               k++ 
            }
        }
        return k
    }
}