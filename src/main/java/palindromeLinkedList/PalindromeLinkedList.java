/*
 * @Source: https://leetcode-cn.com/problems/palindrome-linked-list/
 * @Author: Tian Zhuo
 * @Date: 2019-01-18 22:23:05
 */
package palindromeLinkedList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while(slow != null){
            if(head.val != slow.val){
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        if (head.next.next == null) {
            return head.val == head.next.val;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast.next != null) {
            // 不停的从slow的后一个开始遍历，知道找到值相同的节点
            // 一次完成后，再移动到原节点的下一个节点开始，继续重复上面的步骤
            if (fast.next.val == slow.val) {
                if (fast.next.next != null) {
                    return false;
                }
                fast.next = null;
                slow = slow.next;
                fast = slow.next;
                if (fast == null || fast.val == slow.val) {
                    return true;
                }
            } else {
                fast = fast.next;
            }
        }
        return false;
    }
}