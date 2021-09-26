import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        //I = 1, V = 5, X = 10, L = 50
        //C = 100, D = 500, M = 1000
        Map<String, Integer> romaIntMap = new HashMap<>();
       
        romaIntMap.put("I", 1);
        romaIntMap.put("V", 5);
        romaIntMap.put("X", 10);
        romaIntMap.put("L", 50);
        romaIntMap.put("C", 100);
        romaIntMap.put("D", 500);
        romaIntMap.put("M", 1000);
            
        int convert = romaIntMap.get(s.substring(s.length() - 1, s.length()));
        for (int i = 0; i < s.length() - 1; i++) {
            if (romaIntMap.get(String.valueOf(s.charAt(i))) < romaIntMap.get(String.valueOf(s.charAt(i + 1)))) {
                convert -= romaIntMap.get(String.valueOf(s.charAt(i)));
            } else {
                convert += romaIntMap.get(String.valueOf(s.charAt(i)));
            }
        }
        return convert;
    }

    
}
// @lc code=end

