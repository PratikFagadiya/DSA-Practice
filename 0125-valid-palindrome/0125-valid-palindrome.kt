class Solution {
    fun isPalindrome(s: String): Boolean {

        var left= 0
        var right = s.length -1

        while(left < right) {
            
            while(left < right && !isAlphaNumeric(s[left])) {
                left++
            }

            while(left < right && !isAlphaNumeric(s[right])) {
                right--
            }
            
            if(actualNumber(s[left]) != actualNumber(s[right])) {
                return false
            }


            left++
            right--
        }

        return true
        
    }

    fun isAlphaNumeric(c : Char) : Boolean {
        return (c in 'a'..'z') || (c in 'A'..'Z') || (c in '0'..'9')
    }

    fun actualNumber(c: Char): Int {
        if (c in 'A'..'Z') {
            return c.code + 32
        }
        return c.code
    }

}