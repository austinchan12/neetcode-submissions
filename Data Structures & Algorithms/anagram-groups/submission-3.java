class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ans = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c-'a']++;
            }

            String key = Arrays.toString(count);
            
            if (!ans.containsKey(key)) {
                ArrayList<String> wordList = new ArrayList<>();
                ans.put(key, wordList);
            }

            ans.get(key).add(str);

        }

        return new ArrayList<>(ans.values());

    }
}
