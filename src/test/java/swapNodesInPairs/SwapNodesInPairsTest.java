/*
 * @Source: https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @Author: Tian Zhuo
 * @Date: 2018-12-07 17:00:43
 */
package swapNodesInPairs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SwapNodesInPairsTest {

    public ListNode generate(int[] input) {
        ListNode first = null, last = null, newNode;
        if(input.length > 0) {
            for (int i = 0; i < input.length; i++) {
                newNode = new ListNode(input[i]);
                newNode.next = null;
                if(first == null) {
                    first = newNode;
                    last = newNode;
                }else{
                    last.next = newNode;
                    last = newNode;
                }
            }
        }
        return first;
    }

    @Test
    public void testSwapNodes() {
        ListNode node = generate(new int[]{1, 2, 3, 4});
        SwapNodesInPairs snip = new SwapNodesInPairs();
        ListNode result = snip.swapPairs(node);
        ListNode expected = generate(new int[]{2, 1, 4, 3});
        while(result != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
            if(result == null)
                assertEquals(expected, result);
        }

    }
}