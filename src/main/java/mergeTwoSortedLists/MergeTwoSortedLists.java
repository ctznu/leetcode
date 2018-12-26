/*
 * @Source: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @Author: Tian Zhuo
 * @Date: 2018-12-20 20:57:08
 */
package mergeTwoSortedLists;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if(l1 != null) head.next = l1;
        if(l2 != null) head.next = l2;

        return dummy.next;
    }
}