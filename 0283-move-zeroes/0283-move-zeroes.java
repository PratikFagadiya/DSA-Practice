class Solution {
    public void moveZeroes(int[] nums) {
        
        int j = -1;

        // Find first zero from array
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        // If no zero found means array does not contain any zeros
        if(j == -1) {
            return;
        }

        // Swap values with zero and non-zero array
        for(int i = j + 1; i < nums.length; i++) {
            
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] =  nums[j];
                nums[j] = temp; 
                j++;
            }

        }

    }
}