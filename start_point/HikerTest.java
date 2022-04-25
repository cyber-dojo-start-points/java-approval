import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.AutoApproveReporter;
import org.approvaltests.reporters.linux.ReportOnCyberDojo;

// Use one of the following two lines!
// @UseReporter(AutoApproveReporter.class) // this will automatically approve all results
@UseReporter(ReportOnCyberDojo.class) // to get the diff in the console and a diff file
class HikerTest {

    // if you want to change the expected result, 
    // move HikerTest.testAnswer.received.txt
    // to   HikerTest.testAnswer.approved.txt
    // to view the differences, 
    // open HikerTest.testAnswer.diff
    @Test
    void testAnswer() throws Exception {
        int actual = Hiker.answer();
        Approvals.verify("the answer is: " + actual);
    }
}
