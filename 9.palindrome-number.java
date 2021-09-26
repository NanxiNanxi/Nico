/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int initial = x;
        if ((x < 0 || x % 10 == 0) && x !=0) {
            return false;
        }
        else {
            int reverse = 0;
            while (x != 0) {

                reverse = reverse * 10 + x % 10;
                x = x / 10;
            }
            return reverse == initial;
        }
    }
}
// @lc code=end

