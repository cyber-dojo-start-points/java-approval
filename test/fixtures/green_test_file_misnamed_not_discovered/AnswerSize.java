// This class compiles, but its name ends in neither Test nor Tests, so
// --scan-class-path does not gather it. No approved file is shipped for its
// verify, so it would fail loudly if it ever did run.
import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.cyberdojo.approvals.ReportOnCyberDojoWithoutWaiting;

@UseReporter(ReportOnCyberDojoWithoutWaiting.class)
class AnswerSize {

    @Test
    void testAnswerSize() throws Exception {
        Approvals.verify("the answer is this many digits long: " + String.valueOf(Hiker.answer()).length());
    }
}
