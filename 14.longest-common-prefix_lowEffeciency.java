import java.util.List;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sample = strs[0];
        String prefix = "";
        Boolean isAppend = true;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < sample.length()) {
                sample = strs[i];
            }
        }
        for (int i = 0; i < sample.length(); i++) {
            for (String string : strs) {
                if (string.charAt(i) != sample.charAt(i)) {
                    isAppend = false;
                }
            }
            if (isAppend) {
                prefix = prefix + sample.charAt(i);
            }
        }
        return prefix;
        
    }
}
// @lc code=end

