/*
 * @Source: https://leetcode-cn.com/problems/merge-k-sorted-lists/
 * @Author: Tian Zhuo
 * @Date: 2018-12-31 20:57:03
 */
package mergeKSortedLists;

public class MergeKSortedLists {
    /**
     * 归并
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        int k = lists.length;
        while (k > 1) {
            for (int i = 0; i < k / 2; i++) {
                lists[i] = mergeTwoLists(lists[i], lists[i + (k + 1) / 2]);
            }
            k = (k + 1) / 2;
        }
        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 != null)
            head.next = l1;
        if (l2 != null)
            head.next = l2;

        return dummy.next;
    }

    
    /**
     * 分治
     */
    public ListNode mergeKLists1(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        return sort(lists, 0, lists.length - 1);
    }

    public ListNode sort(ListNode[] lists, int low, int high) {
        if (low >= high)
            return lists[low];
        int mid = (high - low) / 2 + low;
        ListNode l1 = sort(lists, low, mid);
        ListNode l2 = sort(lists, mid + 1, high);
        return merge(l1, l2);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l1 = l1.next;
            } else {
                ListNode next = l2.next;
                l2.next = cur.next;
                cur.next = l2;
                l2 = next;
            }
            cur = cur.next;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return dummy.next;
    }
}