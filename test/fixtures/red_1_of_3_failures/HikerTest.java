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
    void testAnswerIsEven() throws Exception {
        Approvals.verify("the answer is even: " + (Hiker.answer() % 2 == 0));
    }

    @Test
    void testName() throws Exception {
        Approvals.verify("the hiker is called: " + Hiker.name());
    }
}
