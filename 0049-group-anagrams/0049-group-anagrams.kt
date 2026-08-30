class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val hashMap = mutableMapOf<String, MutableList<String>>()


        for(i in 0 until strs.size) {

            val alphabets = IntArray(26)
            val str = strs[i]

            for (char in str) {
                alphabets[char - 'a']++
            }

            val key = alphabets.joinToString("#")

            hashMap.getOrPut(key) { mutableListOf() }.add(str)
        }


        return hashMap.values.toList()    
    }
}