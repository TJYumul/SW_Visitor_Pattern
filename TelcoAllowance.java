import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {

    private static Map<String, Integer> dataAllowanceMap = new HashMap<>();

    static {
        dataAllowanceMap.put("Smart", 15);
        dataAllowanceMap.put("Globe", 10);
        dataAllowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoName + " offers " + dataAllowanceMap.get(telcoName) + "GB for " + money + " pesos.";
    }
}