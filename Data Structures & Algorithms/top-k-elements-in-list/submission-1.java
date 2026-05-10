class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num)+1);
            } else {
                frequency.put(num, 1);
            }
        }

        Set<Integer> keys = frequency.keySet();

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            int max = 0;
            int mostfrequent = 0;
            for (int key : keys) {
                if (frequency.get(key) >= max) {
                    max = frequency.get(key);
                    mostfrequent = key;
                }
            }
            frequency.put(mostfrequent,0);
            ans[i] = mostfrequent;
        }

        return ans;
    }
}
