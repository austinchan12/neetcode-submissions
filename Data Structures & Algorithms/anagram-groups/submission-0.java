class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 1) {
            List<List<String>> result = new ArrayList<>();
            result.add(new ArrayList<>(Collections.singletonList(strs[0])));
            return result;
        } 

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert string to char array, sort it, and turn it back into a string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add the original string to the corresponding list in the map
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
