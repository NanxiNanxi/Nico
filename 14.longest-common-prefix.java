/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        String prefix = strs[0];
        for (String str : strs) {
            while (!str.startsWith(prefix)) {
                if (prefix.length() == 1) {
                    return "";
                }
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
// @lc code=end

