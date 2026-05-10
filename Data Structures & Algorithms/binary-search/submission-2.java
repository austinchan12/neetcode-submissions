class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    public int binarySearch(int left, int right, int[] array, int target) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right-left)/2;

        if (array[mid] > target) {
            return binarySearch(left, mid - 1, array, target);
        } else if (array[mid] < target) {
            return binarySearch(mid + 1, right, array, target);
        } else {
            return mid;
        }
    }
}
