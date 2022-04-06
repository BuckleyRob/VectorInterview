import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

/* Log entries:

2022-04-06T08:58:02 host1 error1
2022-04-06T08:58:02 host2 error2
2022-04-06T08:58:03 host1 error1
*/
//2022-04-06T08:58:03 hast1 error1
public class Main {

    public static void main(String[] args) {
        var logEntries = new ArrayList<String>();
        logEntries.add("2022-04-06T08:58:02 host2 error2");
        logEntries.add("2022-04-06T08:58:03 host1 error1");
        logEntries.add("2022-04-06T08:58:02 host1 error1 exta");
        logEntries.add("2022-04-06T08:58:02 host1");

        var parser = new LogParser();

        var logs = parser.ParseLogs(logEntries);
        logs = FilterLogs.FilterLogs("host2", logs);

        DigestForMostOccurringLog.DigestLogs(logs);

    }
}

