import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution{
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[] { i, map.get(temp) };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
     
    public static void main(String[] args) {
        int[] test = new int[] { 8, 3, 4 };
        int target = 7;
        int[] answer = twoSum(test, target);
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
   
}
// @lc code=end

