class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {

        if (intervals.isEmpty()){
            return emptyArray()
        } 

        // Sort by starting point
        intervals.sortBy { it[0] }

        val result = mutableListOf<IntArray>()

        var start = intervals[0][0]
        var end = intervals[0][1]

        for(i in 1 until intervals.size) {
            val currentStart = intervals[i][0]
            val currentEnd = intervals[i][1]

            if(currentStart <= end) {
                end = Math.max(end, currentEnd)
            }else {
                // No overlap, save the previous interval
                result.add(intArrayOf(start, end))

                start = currentStart
                end = currentEnd
            }

        }

        // Add the last interval
        result.add(intArrayOf(start, end))

        return result.toTypedArray()
    }
}