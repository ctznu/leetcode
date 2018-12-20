/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-20 21:08:44
 */
package mergeTwoSortedLists;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MergeTwoSortedListsTest {

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
    public void testMergeTwoList() {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();
        ListNode l1 = generate(new int[]{1, 2, 4});
        ListNode l2 = generate(new int[]{1, 3, 4});
        ListNode result = mtsl.mergeTwoLists(l1, l2);
        ListNode expected = generate(new int[]{1, 1, 2, 3, 4, 4});
        while(result != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
            if(result == null)
                assertEquals(expected, result);
        }
    }
}