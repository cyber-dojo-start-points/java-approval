import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.cyberdojo.approvals.ReportOnCyberDojoWithoutWaiting;

@UseReporter(ReportOnCyberDojoWithoutWaiting.class)
class HikerTest {

    static int hikers;
    static int answersPerHiker;

    @BeforeAll
    static void shareOutTheAnswers() {
        answersPerHiker = Hiker.answer() / hikers;
    }

    @Test
    void testAnswer() throws Exception {
        Approvals.verify("each hiker gets: " + answersPerHiker);
    }
}
