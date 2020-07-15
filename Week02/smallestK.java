//设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
//
// 示例：
//
// 输入： arr = [1,3,5,7,2,4,6,8], k = 4
//输出： [1,2,3,4]
//
//
// 提示：
//
//
// 0 <= len(arr) <= 100000
// 0 <= k <= min(100000, len(arr))
//
// Related Topics 堆 排序 分治算法


import java.util.Arrays;
import java.util.PriorityQueue;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] smallestK(int[] arr, int k) {
        //--------------------------排序法
//        Arrays.sort(arr);
//        int[] ret = new int[k];
//        for (int i = 0; i < k; i++) {
//            ret[i] = arr[i];
//        }
//        return ret;
        //--------------------------二叉堆法
        PriorityQueue<Integer> heap = new PriorityQueue();
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
