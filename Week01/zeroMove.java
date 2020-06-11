//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例:
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 说明:
//
//
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// Related Topics 数组 双指针


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        //指针-----------------------------我的思路
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            nums[nums.length - i - 1] = 0;
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        //指针-----------------------------同学的思路
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else if (count > 0) {
                nums[i - nums] = nums[i];//与为0的进行交换
                nums[i] = 0;
            }
        }
    }
}



//leetcode submit region end(Prohibit modification and deletion)