class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {


        val map = mutableMapOf<Int,Int>()

        for(i in 0 until nums.size) {

            val previousIndex = map[nums[i]]

            if(previousIndex != null && 
               (i - previousIndex) <= k ) {
                return true
            }

            map[nums[i]] = i

        }
        
        return false
      
    }
}