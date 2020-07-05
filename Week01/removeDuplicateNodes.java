//编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
//
// 示例1:
//
//
// 输入：[1, 2, 3, 3, 2, 1]
// 输出：[1, 2, 3]
//
//
// 示例2:
//
//
// 输入：[1, 1, 1, 1, 2]
// 输出：[1, 2]
//
//
// 提示：
//
//
// 链表长度在[0, 20000]范围内。
// 链表元素在[0, 20000]范围内。
//
//
// 进阶：
//
// 如果不得使用临时缓冲区，该怎么解决？
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //使用一个Set作辅助容器，new一个新的ListNode作为返回结果，
    // 然后开始遍历head，每遍历到一个节点，都检查一下Set里有没有这个值，
    // 如果有，直接跳过，如果没有，就把这个值加到Set容器，并在res后面追加一个节点。
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) return null;
        Set<Integer> set = new HashSet<>();
        ListNode ret = new ListNode(head.val);
        ListNode node = ret;
        set.add(head.val);
        head = head.next;
        while(head != null){
            if(!set.contains(head.val)){
                set.add(head.val);
                node.next = new ListNode(head.val);
                node = node.next;
            }
            head = head.next;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
