class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()

        for(i in 0 until nums.size) {
            val remaining = target - nums[i]
            if(map.containsKey(remaining)) {
                return intArrayOf(map[remaining]!!, i)
            }

            map[nums[i]] = i

        }

        return intArrayOf()
    }
}