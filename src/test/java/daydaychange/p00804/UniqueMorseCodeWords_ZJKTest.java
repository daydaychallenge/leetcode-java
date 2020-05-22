package daydaychange.p00804;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueMorseCodeWords_ZJKTest {

    UniqueMorseCodeWords_ZJK uniqueMorseCodeWords = new UniqueMorseCodeWords_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals(2,
                uniqueMorseCodeWords.uniqueMorseRepresentations(
                        new String[]{"gin", "zen", "gig", "msg"}));
    }

}
