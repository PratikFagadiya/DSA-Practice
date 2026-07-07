class Solution {
    public int majorityElement(int[] nums) {

        int majorityNum = nums[0];
        int counter =  1;

        for(int i = 1; i < nums.length ; i++) {

            if(nums[i] == majorityNum) {
                counter++;
            }else {
                counter--;
            }

            if(counter == 0) {
               majorityNum =  nums[i];
               counter++;
            }

        }

        int tempCount = 0;

        for(int i = 0; i < nums.length; i++) {
                if(majorityNum == nums[i]) {
                    tempCount++;
                }
        }

        boolean isValid = (nums.length / 2) < tempCount;
        
        if(isValid){
            return majorityNum;
        }

        return 0;

    }
}