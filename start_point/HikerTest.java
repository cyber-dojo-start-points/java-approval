import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.linux.ReportOnCyberDojo;

@UseReporter(ReportOnCyberDojo.class)
class HikerTest {

    @Test
    void testAnswer() throws Exception {
        int actual = Hiker.answer();
        Approvals.verify("the answer is: " + actual);
    }
}
