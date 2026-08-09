class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length){
            return false
        }

        val nums = IntArray(26)

        for(i in 0 until s.length) {
            nums[s[i] - 'a']++
            nums[t[i] - 'a']--
        }
        
        val isAnagram = nums.all {
            it == 0
        }

        return isAnagram

    }
}