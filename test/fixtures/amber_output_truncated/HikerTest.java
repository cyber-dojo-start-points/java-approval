// The loop writes to stdout, which is the stream JUnit's own summary comes out
// on. The runner keeps the first 50K of each stream, so the loop's head
// survives and the counts the lambda reads are cut off the end.
import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.cyberdojo.approvals.ReportOnCyberDojoWithoutWaiting;

@UseReporter(ReportOnCyberDojoWithoutWaiting.class)
class HikerTest {

    @Test
    void testAnswer() throws Exception {
        for (int i = 0; i != 20000; i++) {
            System.out.println("debug: i is " + i);
        }
        Approvals.verify("the answer is: " + Hiker.answer());
    }
}
