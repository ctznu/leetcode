/*
 * @Source: https://leetcode-cn.com/problems/palindrome-linked-list/
 * @Author: Tian Zhuo
 * @Date: 2019-01-19 11:25:16
 */
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    if(!head || !head.next) {
        return true;
    }
    let fast = head;
    let slow = head;
    while(fast.next && fast.next.next){
        fast = fast.next.next;
        slow = slow.next;
    }
    slow = reverse(slow.next);
    while(slow){
        if(head.val !== slow.val){
            return false;
        }
        slow = slow.next;
        head = head.next;
    }
    return true;

};
var reverse = function(head) {
    if(!head) {
        return null;
    }
    if(!head.next){
        return head;
    }
    let newHead = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
}

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome1 = function(head) {
    if(!head) return true;
    let s = head;
    let f = head;

    while(f && f.next && f.next.next) {
        s = s.next;
        f = f.next.next;
    }
    let right = s.next;
    s.next = null;

    let current = right;
    let last = null;
    while(current){
        const next = current.next;
        current.next = last;
        last = current;
        current = next;
    }

    a = head;
    b = last;

    while(a && b) {
        if(a.val !== b.val) {
            return false;
        }
        a = a.next;
        b = b.next;
    }
    return true;
};