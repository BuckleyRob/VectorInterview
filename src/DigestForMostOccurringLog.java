import java.util.HashMap;
import java.util.List;

public class DigestForMostOccurringLog {
    public static void DigestLogs(List<Log> logs){

        var errors = new HashMap<String, Integer>();
        for (Log log : logs) {
            if(errors.containsKey(log.error)){
                errors.put(log.error,errors.get(log.error) + 1);
            }else{
                errors.put(log.error, 1);
            }
        }

        var top = "";
        var topCount = 0;
        for (String key : errors.keySet()) {
            if( errors.get(key) > topCount){
                top = key;
                topCount = errors.get(key);
            }
        }

        System.out.printf("Top error is %s with %d count\n", top, topCount);
    }
}
