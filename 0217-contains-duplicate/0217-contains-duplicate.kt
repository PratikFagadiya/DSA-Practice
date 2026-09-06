class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet = mutableSetOf<Int>()

        for(i in nums.indices) {
            if(hashSet.contains(nums[i])) {
                return true
            }
            hashSet.add(nums[i])
        }
    
        return false
    }

}