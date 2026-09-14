// The learner has reached for a plain JUnit assertion rather than an approval,
// so no approved file is involved at all. It is a failing test either way, and
// the lambda names it red.
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class HikerTest {

    @Test
    void testAnswer() throws Exception {
        assertEquals(42, Hiker.answer());
    }
}
