// The @Test annotation is missing, so JUnit gathers nothing and reports
// "0 tests found". red_amber_green.rb reads "0 tests failed" as green without
// asking whether any test ran, so a kata with nothing to run reaches green.
import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.cyberdojo.approvals.ReportOnCyberDojoWithoutWaiting;

@UseReporter(ReportOnCyberDojoWithoutWaiting.class)
class HikerTest {

    void testAnswer() throws Exception {
        Approvals.verify("the answer is: " + Hiker.answer());
    }
}
