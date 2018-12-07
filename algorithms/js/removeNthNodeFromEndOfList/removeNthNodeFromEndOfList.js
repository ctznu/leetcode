/*
 * @Source: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * @Author: Tian Zhuo
 * @Date: 2018-12-06 20:57:57
 */


//   Definition for singly-linked list.
/*   function ListNode(val) {
      this.val = val;
      this.next = null;
  }

  function arrToList(arr) {
      let l = new ListNode(0);
      let head = l;
      for (const e of arr) {
        l.next = new ListNode(e);
        l = l.next;
      }
      return head.next;
  } */

/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    let dummy = new ListNode(0);
    dummy.next = head;
    let len = 0;
    let first = head;
    while(first){
        first = first.next;
        len++;
    }
    len -= n;
    first = dummy;
    while(len > 0){
        first = first.next;
        len--;
    }
    first.next = first.next.next;
    return dummy.next;
};

//solution 2 -- 
var removeNthFromEnd = function(head, n) {
    let dummy = new ListNode(0);
    dummy.next = head;
    let first = dummy;
    let second = dummy;
    while(n >= 0){
        first = first.next;
        n--;
    }
    while(first){
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
}

//solution 3
let removeNthFromEnd = function(head, n) {
    return removeNthFromEndHelper(head, n, 0) === n ? head.next : head;
};

let removeNthFromEndHelper = function(head, n, count) {
    if (head.next !== null) {
        count = removeNthFromEndHelper(head.next, n, count);
    }
    if (count === n) {
        head.next = head.next.next;
    }
    return ++count;
};