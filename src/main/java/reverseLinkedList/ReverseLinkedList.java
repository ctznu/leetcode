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

    public ListNode reverse(ListNode head){
        // 递归到最后一个节点，返回新的新的头结点
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}