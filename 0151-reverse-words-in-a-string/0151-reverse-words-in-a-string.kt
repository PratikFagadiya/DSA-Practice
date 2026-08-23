class Solution {
    fun reverseWords(s: String): String {
        val arrays = s.trim().split("\\s+".toRegex())

        var sb = StringBuilder()

        for(i in arrays.size - 1 downTo 0) {
            sb.append(arrays[i]).append(" ")
        }

        return sb.toString().trim()
    }
}