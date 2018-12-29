/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-29 12:47:22
 */
package substringWithConcatenationOfAllWords;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;
public class SubstringWithConcatenationOfAllWordsTest {
    @Test
    public void test() {
        SubstringWithConcatenationOfAllWords swc = new SubstringWithConcatenationOfAllWords();
        // List<Integer> res = swc.findSubstring("barfoothefoobarman", new String[]{"foo","bar"});
        List<Integer> res = swc.findSubstring1("barfoothefoobarman", new String[]{"foo","bar"});
        assertThat(res, containsInAnyOrder(0, 9));
    }
}