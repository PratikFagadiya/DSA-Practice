class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = mutableSetOf<Int>()

        for(i in 0 until nums.size) {
            if(map.contains(nums[i])) return true
            map.add(nums[i])
        }

        return false
    }
}