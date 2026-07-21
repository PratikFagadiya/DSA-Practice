class Solution {
    public void moveZeroes(int[] nums) {
        int firstZeroIndex = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                firstZeroIndex = i;
                break;
            }
        }

        if (firstZeroIndex == Integer.MIN_VALUE || firstZeroIndex == nums.length - 1) {
            return;
        }

        for (int i = firstZeroIndex + 1; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[firstZeroIndex];
                nums[firstZeroIndex] = nums[i];
                nums[i] = temp;
                firstZeroIndex++;
            }

        }

    }
}