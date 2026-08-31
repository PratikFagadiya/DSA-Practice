class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {

        val hashMap = mutableMapOf<Int,Int>()

        for(i in 0 until nums.size) {

            if(hashMap.containsKey(nums[i])) {
                val lastNumberPosition = hashMap[nums[i]]!!
                if((i - lastNumberPosition) <= k) {
                    return true
                }
            }

            hashMap[nums[i]] = i
        }

        return false
    }
}