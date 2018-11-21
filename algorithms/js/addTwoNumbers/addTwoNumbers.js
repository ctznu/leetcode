// Source : https://leetcode-cn.com/problems/add-two-numbers/
// Author : Tian Zhuo
// Date   : 2018-11-21


// [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
// [5,6,4]
// [6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
//   Definition for singly-linked list.
//   function ListNode(val) {
//       this.val = val;
//       this.next = null;
//   }

//   function arrToList(arr) {
//       let l = new ListNode(0);
//       let head = l;
//       for (const e of arr) {
//         l.next = new ListNode(e);
//         l = l.next;
//       }
//       return head.next;
//   }

/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let dummyHead = new ListNode(0);
    let p = l1, q = l2, curr = dummyHead;
    let carry = 0;
    while (p != null || q != null) {
        let x = (p != null) ? p.val : 0;
        let y = (q != null) ? q.val : 0;
        let sum = carry + x + y;
        carry = sum > 9 ? 1 : 0;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
};