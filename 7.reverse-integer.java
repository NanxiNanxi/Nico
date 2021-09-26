/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution{
    public int reverse(int x) {
        int reverse = 0;    
        
        while (x != 0)
        {
            int remain = x % 10;
            reverse = reverse * 10 + remain;
            //reverse发生时值可能会大于int的最大值,所以需要加一个check逻辑
            if (reverse%10 != remain) {
                return 0;
            }
            x = x / 10;
            
        }
        return reverse;
    }
    /*public static void main(String[] args) {
        System.out.println(reverse(1875641235));
    }*/
}
// @lc code=end

