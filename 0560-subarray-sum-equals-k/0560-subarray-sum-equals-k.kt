class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()
        map[0] = 1

        var sum = 0
        var count = 0
        
        for (num in nums) {
            sum += num

            val requiredSum = sum - k
            val previousCount = map.getOrDefault(requiredSum, 0)

            count += previousCount

            val currentCount = map.getOrDefault(sum, 0)
            map[sum] = currentCount + 1
        }
        
        return count
    }
}