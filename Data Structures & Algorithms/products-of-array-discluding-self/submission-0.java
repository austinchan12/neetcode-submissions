class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        int prefixvalue = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = 1 * prefixvalue * nums[i];
            prefixvalue = prefix[i];
        }

        int postvalue = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            postfix[i] = 1 * postvalue * nums[i];
            postvalue = postfix[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int prefixVal = (i > 0) ? prefix[i - 1] : 1;
            int postfixVal = (i < nums.length - 1) ? postfix[i + 1] : 1;
            output[i] = prefixVal * postfixVal;
        }


        return output;
    }
}  
