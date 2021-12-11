import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.linux.ReportOnCyberDojo;

@UseReporter(ReportOnCyberDojo.class)
class HikerTest {

    @Test
    void testAnswer() throws Exception {
        int actual = Hiker.answer();
        // if you want to change the expected result, 
        // move HikerTest.testAnswer.received.txt
        // to   HikerTest.testAnswer.approved.txt
        // to view the differences, 
        // open HikerTest.testAnswer.diff
        Approvals.verify("the answer is: " + actual);
    }
}
