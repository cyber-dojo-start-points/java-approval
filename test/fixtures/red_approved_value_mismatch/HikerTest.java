// The approved value and the value the code produces differ. The reporter
// turns that into a JUnit assertion failure, so the run counts one failing
// test and the lambda names it red.
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
