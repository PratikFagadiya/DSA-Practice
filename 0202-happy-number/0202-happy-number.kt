class Solution {
    fun isHappy(n: Int): Boolean {
        
        val set = mutableSetOf<Int>()
        var number = n

        while(!set.contains(number)) {
             set.add(number)
             number = squareNumber(number) 
        }

        return number == 1;
    }

    fun squareNumber(number : Int) : Int {
        var answer = 0
        var n = number

        while(n > 0) {
            val ld = n % 10
            answer = answer + (ld * ld)
            n = n / 10
        }

        return answer
    }

}