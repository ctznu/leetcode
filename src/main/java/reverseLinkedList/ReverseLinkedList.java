/*
 * @Source: https://leetcode-cn.com/problems/reverse-linked-list/
 * @Author: Tian Zhuo
 * @Date: 2019-01-17 21:02:32
 */
package reverseLinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head==null) {
            return null;
        }
        ListNode reversedHead = null;
        ListNode current = head;
        while (current !=null) {
            ListNode next = current.next;
            current.next = reversedHead;
            reversedHead = current;
            current = next;
        }
        return reversedHead;
    }
}