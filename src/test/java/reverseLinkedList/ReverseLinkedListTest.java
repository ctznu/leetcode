/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-17 21:27:57
 */
package reverseLinkedList;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseLinkedListTest {

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
    public void testReverseList() {
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode head = generate(new int[]{1, 2, 3, 4, 5});
        ListNode expected = generate(new int[]{5, 4, 3, 2, 1});
        
        ListNode result = rll.reverseList(head);
        while(result != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
            if(result == null)
                assertEquals(expected, result);
        }


    }
}