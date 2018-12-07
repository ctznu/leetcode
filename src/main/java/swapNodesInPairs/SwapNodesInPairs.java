/*
 * @Source: https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @Author: Tian Zhuo
 * @Date: 2018-12-07 17:00:43
 */
package swapNodesInPairs;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(pre.next != null && pre.next.next != null) {
            ListNode nodeA = pre.next;
            ListNode nodeB = nodeA.next;
            ListNode last = nodeB.next;

            pre.next = nodeB;
            nodeB.next = nodeA;
            nodeA.next= last;

            pre = nodeA;
        }
        return dummy.next;
    }
}