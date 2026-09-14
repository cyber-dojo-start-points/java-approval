import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.cyberdojo.approvals.ReportOnCyberDojoWithoutWaiting;

@UseReporter(ReportOnCyberDojoWithoutWaiting.class)
class HikerTest {

    @Test
    void testAnswer() throws Exception {
        Approvals.verify("the answer is: " + Hiker.answer());
    }

    @Test
    void testAnswerIsAMultipleOfSeven() throws Exception {
        Approvals.verify("the answer is a multiple of seven: " + (Hiker.answer() % 7 == 0));
    }

    @Test
    void testName() throws Exception {
        Approvals.verify("the hiker is called: " + Hiker.name());
    }
}
