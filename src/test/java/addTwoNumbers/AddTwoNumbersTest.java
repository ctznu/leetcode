/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-02 18:01:04
 */

 package addTwoNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTwoNumbersTest {

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
    public void testAddTwoNumbers() {
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = generate(new int[]{2, 4, 3});
        ListNode l2 = generate(new int[]{5, 6, 4});
        ListNode l = atn.addTwoNumbers(l1, l2);
        ListNode expected = generate(new int[]{7, 0, 8});
        while(l != null){
            assertEquals(l.val, expected.val);
            l = l.next;
            expected = expected.next;
            if(l == null)
            assertEquals(l, expected);
        }
    }
 }