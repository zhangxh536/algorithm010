//给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, 
//ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。 
//
// 说明：你不能倾斜容器，且 n 的值至少为 2。 
//
// 
//
// 
//
// 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。 
//
// 
//
// 示例： 
//
// 输入：[1,8,6,2,5,4,8,3,7]
//输出：49 
// Related Topics 数组 双指针


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        //分为3种情况，左节点小于右节点,左节点等于右节点，右节点大于左节点
        int left = 0;//左节点指针
        int right = height.length - 1;//右节点指针
        int cap = 0;//计算容量
        int maxCap = 0;//最大容量
        while (left < right) {
            if (height[left] < height[right]) {
                cap = height[left] * (right - left);
                left++;
            } else if (height[left] > height[right]) {
                cap = height[right] * (right - left);
                right--;
            } else {
                cap = height[left] * (right - left);
                left++;
                right--;
            }
            if (maxCap < cap) {
                maxCap = cap;
            }
        }
        return maxCap;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
