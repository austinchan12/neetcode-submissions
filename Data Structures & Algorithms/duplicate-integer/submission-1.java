class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();

        int size = uniques.size();
        System.out.println(size);

        for (int num : nums) {
            uniques.add(num);
            if (size == uniques.size()) {
                return true;
            }
            size = uniques.size();
        }

        return false;
    }
}
