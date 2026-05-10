class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] solution = new int[2];
        int left = 0;
        int right = numbers.length-1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                solution[0] = left+1;
                solution[1] = right+1;
                break;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return solution;
    }
}
