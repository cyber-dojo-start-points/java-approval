// Nothing here mentions Digits, but javac compiles *.java as one batch, so a
// file nobody uses still stops the whole run.
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
