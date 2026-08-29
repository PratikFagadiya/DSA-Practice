class Solution {
    fun romanToInt(s: String): Int {

        val values = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var result = 0

        for(i in 0 until s.length - 1) {
            val currentValue = values[s[i]] ?: 0
            if(i + 1 < s.length && currentValue < (values[s[i + 1]] ?: 0)) {
                result = result - currentValue
            }else {
                result = result + currentValue
            }
        }

        result = result + values[s[s.length -1]]!!

        return result
    }
}