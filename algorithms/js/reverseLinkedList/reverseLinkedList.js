/*
 * @Source: https://leetcode-cn.com/problems/reverse-linked-list/
 * @Author: Tian Zhuo
 * @Date: 2019-01-17 21:43:04
 */

// Definition for singly-linked list.
function ListNode(val) {
    this.val = val;
    this.next = null;
}

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    if(head == null) {
        return null;
    }
    let curr = head;
    let reversedHead = null;
    while(curr){
        let next = curr.next;
        curr.next = reversedHead;
        reversedHead = curr;
        curr = next;
    }
    return reversedHead;
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