//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//
//
//
// 示例:
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
//
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) return head;//如果只有一个头节点或者没有节点直接返回当前链表不用交换
        ListNode first = head;
        ListNode second = head.next;
        first.next = swapPairs(second.next);//把第奇数节点指向下个second节点;
        second.next = first;
        return second;//每层递归返回一个被上层奇数指向的secondNode节点
    }
}
//leetcode submit region end(Prohibit modification and deletion)
