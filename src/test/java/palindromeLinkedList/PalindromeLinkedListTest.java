/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-18 22:40:08
 */
package palindromeLinkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeLinkedListTest {

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
    public void testIsPalindrome() {
        PalindromeLinkedList pll = new PalindromeLinkedList();
        ListNode head = generate(new int[]{1, 2, 2, 1});
        assertEquals(true, pll.isPalindrome(head));
        ListNode head1 = generate(new int[]{1, 2, 3, 2, 1});
        assertEquals(true, pll.isPalindrome(head1));
        ListNode head2 = generate(new int[]{1, 2});
        assertEquals(false, pll.isPalindrome(head2));
    }
}