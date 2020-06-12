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
        for (int i = 0; i < nums.length - 2; i++) {//由于是3个数，所以到lenght-2只有一个解就结束了
            int j = i + 1, k = nums.length - 1;//next节点和尾节点
            if (nums[i] > 0) break;//由于排序了第一个数(最小数)都是正数的话就不可能为0了
            if (i > 0 && nums[i] == nums[i - 1]) continue;//重复数跳过
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];//三数之和
                if (sum < 0) {//说明nums[j] + nums[k]的结果正数较小 next指针继续往大的数移动
                    while (j < k && nums[j] == nums[++j]);
                } else if (sum > 0) { //说明nums[j] + nums[k]的结果正数较大 尾指针继续往小的数移动
                    while (j < k && nums[k] == nums[--k]);
                } else {
                    ret.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));//为0就加入list
                    while (j < k && nums[j] == nums[++j]);
                    while (j < k && nums[k] == nums[--k]);
                }
            }
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
