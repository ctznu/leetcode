/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-17 13:09:38
 */
package letterCombinationsOfAPhoneNumber;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void test() {
        LetterCombinationsOfAPhoneNumber lc = new LetterCombinationsOfAPhoneNumber();
        List<String> res = lc.letterCombinations("23");
        assertThat(res, containsInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));

    }
}