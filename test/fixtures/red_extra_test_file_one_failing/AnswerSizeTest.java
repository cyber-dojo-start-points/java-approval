import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.cyberdojo.approvals.ReportOnCyberDojoWithoutWaiting;

@UseReporter(ReportOnCyberDojoWithoutWaiting.class)
class AnswerSizeTest {

    @Test
    void testAnswerSize() throws Exception {
        Approvals.verify("the answer is this many digits long: " + String.valueOf(Hiker.answer()).length());
    }
}
