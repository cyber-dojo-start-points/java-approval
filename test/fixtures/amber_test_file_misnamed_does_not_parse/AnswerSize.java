// A name ending in neither Test nor Tests keeps this class out of the scan, but
// it is still handed to javac, so the missing semicolon stops the run before
// any test is gathered.
import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.cyberdojo.approvals.ReportOnCyberDojoWithoutWaiting;

@UseReporter(ReportOnCyberDojoWithoutWaiting.class)
class AnswerSize {

    @Test
    void testAnswerSize() throws Exception {
        Approvals.verify("the answer is this many digits long: " + String.valueOf(Hiker.answer()).length())
    }
}
