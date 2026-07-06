class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> map = new HashMap<>();

       for(int i = 0; i < strs.length ; i++) {

               int[] count = new int[26];

               // frequency count
               String word = strs[i];
               for(int j = 0; j < word.length() ; j++) {
                    count[word.charAt(j) - 'a']++;
               }

               // Build the key here for unique
               StringBuilder sb = new StringBuilder();

               for (int num : count) {
                    sb.append("#");
                    sb.append(num);
               }

               String key = sb.toString();

            // Put the key & value into map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);

       }

         return new ArrayList<>(map.values());
    }
}