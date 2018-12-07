/*
 * @Source: https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * @Author: Tian Zhuo
 * @Date: 2018-12-07 13:03:18
 */
//   Definition for singly-linked list.
  /* function ListNode(val) {
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
 * @return {ListNode}
 */
var swapPairs = function(head) {
    let dummy = new ListNode(0);
    dummy.next = head;
    let pre = dummy;
    while(pre.next && pre.next.next){
        let nodeA = pre.next;
        let nodeB = nodeA.next;
        let last = nodeB.next;

        pre.next = nodeB;
        nodeB.next = nodeA;
        nodeA.next = last;

        pre = nodeA;
    }
    return dummy.next;
};