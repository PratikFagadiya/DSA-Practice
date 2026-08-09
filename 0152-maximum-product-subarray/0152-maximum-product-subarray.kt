class Solution {
    fun maxProduct(nums: IntArray): Int {

       var pref = 1
       var suff = 1
       val n = nums.size
       var ans = Integer.MIN_VALUE

        for(i in 0 until n){
            if(pref == 0) {
                pref = 1
            }
            if(suff == 0) {
                suff = 1
            }

            pref = pref * nums[i]
            suff = suff * nums[n - i - 1]
            ans = Math.max(ans , Math.max(pref,suff))
        }

        return ans

    }
}