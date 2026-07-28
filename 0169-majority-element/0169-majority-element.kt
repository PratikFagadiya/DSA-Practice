class Solution {
    fun majorityElement(nums: IntArray): Int {
        var selectedNum = nums[0]
        var counter = 0 

        for(i in 1 until nums.size) {
            if(selectedNum == nums[i]) {
                counter++
            }else {
                counter--
            }

            if(counter < 0) {
                counter = 0
                selectedNum = nums[i]
            }
        }

        return selectedNum

    }
}