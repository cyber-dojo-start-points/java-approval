import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.cyberdojo.approvals.ReportOnCyberDojoWithoutWaiting;

@UseReporter(ReportOnCyberDojoWithoutWaiting.class)
class FizzBuzzTest {

    @Test
    void testThree() throws Exception {
        Approvals.verify("three says: " + FizzBuzz.say(3));
    }
}
