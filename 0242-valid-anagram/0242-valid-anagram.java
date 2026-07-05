class Solution {
    public boolean isAnagram(String s, String t) {

        int sLength = s.length();
        int tLength = t.length();
        
        if(sLength != tLength) {
            return false;
        }

        int[] alphabets = new int[26];

        for(int i = 0; i < sLength; i++) {
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < alphabets.length; i++) {
                if(alphabets[i] != 0) {
                    return false;
                }
        }
        
        return true;
    }
}