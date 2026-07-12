class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int startIndex=0;
        int lastIndex = numbers.length - 1;

        for(int i = 0 ; i < numbers.length ; i++) {
            if(numbers[startIndex] + numbers[lastIndex] == target) {
                startIndex++;
                lastIndex++;
                return new int[] {startIndex, lastIndex};
            }else if(numbers[startIndex] + numbers[lastIndex] < target) {
                startIndex++;
            }else {
                lastIndex--;
            }
        }

        return new int[] {-1};


    }
}