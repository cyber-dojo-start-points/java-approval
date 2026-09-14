// There is no HikerTest.testAnswer.approved.txt beside this test, which is what
// the first run of a newly written verify looks like. ApprovalTests writes the
// received file and fails, so the learner sees the value they got and can
// approve it.
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
}
