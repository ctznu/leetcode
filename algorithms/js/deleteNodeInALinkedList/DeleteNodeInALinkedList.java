/*
 * @Source: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @Author: Tian Zhuo
 * @Date: 2019-01-16 21:23:21
 */
package deleteNodeInALinkedList;

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}