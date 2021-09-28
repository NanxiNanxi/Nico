import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> brakets = new HashMap<>();
        brakets.put('(', ')');
        brakets.put('{', '}');
        brakets.put('[', ']');

        Stack<Character> container = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (brakets.containsKey(c)) {
                container.push(brakets.get(c));
            } else {
                if (container.size() < 1 || container.pop() != c) {
                    return false;
                }
            }
        }
        if (container.size() > 0) {
            return false;
        }
        return true;
    }
    
}
// @lc code=end

