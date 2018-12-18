/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-18 11:49:05
 */
package removeNthNodeFromEndOfList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveNthNodeFromEndOfListTest {

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
    public void test() {
        RemoveNthNodeFromEndOfList rnn = new RemoveNthNodeFromEndOfList();
        ListNode head = generate(new int[]{1, 2, 3, 4, 5});
        ListNode result = rnn.removeNthFromEnd(head, 2);
        ListNode expected = generate(new int[]{1, 2, 3, 5});
        while(result != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
            if(result == null)
                assertEquals(expected, result);
        }
    }
}