class Solution {

    public int reverse(int x) {

        int reveredNumber = 0;
        
        while (x != 0) {
            int lastDigit = x % 10;
            x = x / 10;

            // Check for overflow before multiplying
            if (reveredNumber > Integer.MAX_VALUE / 10 || 
                reveredNumber < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reveredNumber = reveredNumber * 10 + lastDigit;
        }   
        return reveredNumber;
    }

}