import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunTest {

    String[] array = {"qwe", "wqe", "qwee", "a", "cat", "a", "weq", "a",
            "eqw", "Q", "hgf", "poi", "QQ", "act", "gfh", "Q", "iop", "s", "ss", "Q"};

    String expectedResult = "qwe = 0, 1, 6, 8 a = 3, 5, 7 cat = 4, 13 Q = 9, 15, 19 hgf = 10, 14 poi = 11, 16";

    @Test
    void funTest() {
        Assertions.assertEquals(expectedResult, Task.containsFun(array));
    }
}
