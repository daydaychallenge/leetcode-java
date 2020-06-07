package daydaychange.p00657;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RobotReturnToOrigin_ZJKTest {

    RobotReturnToOrigin_ZJK returnToOrigin = new RobotReturnToOrigin_ZJK();

    @Test
    public void test() {
        Assertions.assertEquals(true, returnToOrigin.judgeCircle("UDRL"));
    }

}
