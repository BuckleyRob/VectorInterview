import java.security.spec.ECField;
import java.util.ArrayList;

public class LogParser {
    public Log ParseLog(String log) {
        try {
         var parsedLog = Log.BuildLog(log);
            return parsedLog;
        }catch (Exception e){
            //do metrics/logging
            System.out.printf("Encountered bad log %s\n", log);
        }
        return null;
    }

    public ArrayList<Log> ParseLogs(ArrayList<String> logEntries) {
        var logs = new ArrayList<Log>();
        for (String stringLog : logEntries) {
            var addLog = ParseLog(stringLog);
            if(addLog != null)
                logs.add(addLog);

        }
        return logs;
    }
}
