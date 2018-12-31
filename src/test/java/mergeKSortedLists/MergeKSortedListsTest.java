/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-31 22:40:26
 */
package mergeKSortedLists;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MergeKSortedListsTest {

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
    public void testMergeKLists() {
        MergeKSortedLists mksl = new MergeKSortedLists();
        ListNode l1 = generate(new int[]{1, 4, 5});
        ListNode l2 = generate(new int[]{1, 3, 4});
        ListNode l3 = generate(new int[]{2, 6});
        ListNode[] ls = new ListNode[]{l1, l2, l3};
        // ListNode result = mksl.mergeKLists(ls);
        ListNode result = mksl.mergeKLists1(ls);
        ListNode expected = generate(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        while(result != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
            if(result == null)
                assertEquals(expected, result);
        }
    }
}