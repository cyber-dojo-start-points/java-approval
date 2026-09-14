// cyber-dojo.sh compiles *.java, which does not descend into sub-directories,
// so this file is never compiled and the class it declares never exists for
// --scan-class-path to find. Its deliberate mistake is therefore never
// reported: only HikerTest runs.
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
