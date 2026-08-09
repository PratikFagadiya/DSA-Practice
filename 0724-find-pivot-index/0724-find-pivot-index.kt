class Solution {
    fun pivotIndex(nums: IntArray): Int {

        var totalSum = 0
        for(i in 0 until nums.size) {
            totalSum = totalSum + nums[i]    
        }

        var leftSum = 0

        for(i in 0 until nums.size) {
            var rightSum = totalSum - leftSum - nums[i]

            if(leftSum == rightSum){
                return i
            }

            leftSum = leftSum + nums[i] 
        }
        
        return -1
    }
}