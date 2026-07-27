class Solution {
    fun maxProfit(prices: IntArray): Int {
        var mProfit = 0
        var minPrice = Integer.MAX_VALUE

        for(i in 0 until prices.size) {
            minPrice = Math.min(minPrice, prices[i])
            mProfit = Math.max(mProfit , prices[i] - minPrice)
        }   

        return mProfit
    }
}