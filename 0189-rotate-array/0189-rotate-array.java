class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;

        reverseArray(nums, 0, n - k - 1);
        reverseArray(nums, n - k, n - 1);
        reverseArray(nums, 0 , n - 1);
    }

    private void reverseArray(int[] numbers, int startIndex, int endIndex){
            while(startIndex < endIndex) {
                int temp = numbers[startIndex];
                numbers[startIndex] = numbers[endIndex];
                numbers[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
    }
}