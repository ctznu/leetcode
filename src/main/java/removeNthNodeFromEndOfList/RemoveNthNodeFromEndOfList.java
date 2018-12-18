/*
 * @Source: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * @Author: Tian Zhuo
 * @Date: 2018-12-18 11:44:48
 */
package removeNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        while(n >= 0){
            first = first.next;
            n--;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}