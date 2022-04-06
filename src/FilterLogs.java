import java.util.ArrayList;

public class FilterLogs {
    public static ArrayList<Log> FilterLogs(String hostName, ArrayList<Log> logs) {
        var unfiltered = new ArrayList<Log>();
        for (Log log : logs) {
            if (log.hostName.equals(hostName))
                unfiltered.add(log);
        }
        return unfiltered;
    }
}
