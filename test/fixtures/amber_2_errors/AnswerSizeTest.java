import org.junit.jupiter.api.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.cyberdojo.approvals.ReportOnCyberDojoWithoutWaiting;

@UseReporter(ReportOnCyberDojoWithoutWaiting.class)
class AnswerSizeTest {

    static int columns;
    static int digitsPerColumn;

    @BeforeAll
    static void layOutTheAnswer() {
        digitsPerColumn = String.valueOf(Hiker.answer()).length() / columns;
    }

    @Test
    void testAnswerSize() throws Exception {
        Approvals.verify("each column holds this many digits: " + digitsPerColumn);
    }
}
