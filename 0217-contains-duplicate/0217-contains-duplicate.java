class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // Used HashSet for unique values
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0 ; i < nums.length ; i++) {

            // If HashSet contains means value exist and it contain duplicate value
            if(set.contains(nums[i])) {
               return true; 
            }
            set.add(nums[i]);
        }
        return false;
    }
}