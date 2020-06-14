//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
// 示例：
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
//
// Related Topics 数组 双指针


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int a = i + 1 , b = nums.length - 1;
            while (a < b) {
                int sum = nums[i] + nums[a] + nums[b];
                if (sum < 0) {
                    while (a < b && nums[a] == nums[++a]);
                } else if (sum > 0) {
                    while (a < b && nums[b] == nums[--b]);
                } else {
                    ret.add(new ArrayList<Integer>(Arrays.asList(nums[a],nums[b],nums[i])));
                    while (a < b && nums[a] == nums[++a]);
                    while (a < b && nums[b] == nums[--b]);
                }

            }
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
