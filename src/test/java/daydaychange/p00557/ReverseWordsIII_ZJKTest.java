package daydaychange.p00557;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-17 10:19
 */
public class ReverseWordsIII_ZJKTest {

    ReverseWordsIII_ZJK reverseWords = new ReverseWordsIII_ZJK();

    @Test
    public void reverseWords() {
        Assertions.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords.reverseWords("Let's take LeetCode contest"));
    }

}
