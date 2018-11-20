// Source : https://leetcode-cn.com/problems/merge-two-sorted-lists/
// Author : Tian Zhuo
// Date   : 2018-11-20

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    let l = new ListNode(0);
    let head = l;
    while(l1 && l2){
        if(l1.val < l2.val){
            l.next = l1;
            l1 = l1.next;
        }else{
            l.next = l2;
            l2 = l2.next;
        }
        l = l.next;
    }
    if(l1) l.next = l1;
    if(l2) l.next = l2;
    return head.next;
};
// recursion implement
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function (l1, l2) {
    if (l1 == null) return l2
    if (l2 == null) return l1
    if (l1.val <= l2.val) {
        l1.next = mergeTwoLists(l1.next, l2)
        return l1
    } else {
        l2.next = mergeTwoLists(l1, l2.next)
        return l2
    }
}