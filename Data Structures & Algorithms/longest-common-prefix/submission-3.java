class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";

        // character index:    0 0 0 1 1 1 2 2 2 ...
        // word index(strs):   0 1 2 0 1 2 0 1 2 ...

        boolean same = true;

        for (int charIndex = 0; charIndex < strs[0].length(); charIndex++) {
            for (int wordIndex = 0; wordIndex < strs.length; wordIndex++) {
                if ((charIndex == strs[wordIndex].length()) || (strs[wordIndex].charAt(charIndex) != strs[0].charAt(charIndex))) {
                    same = false;
                    break;
                }
            }
            if (!same) break;
            ans += strs[0].charAt(charIndex);
        }

        return ans;
    }
}



