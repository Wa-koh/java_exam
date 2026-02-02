import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        String[] someSports = { "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer",
                "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging",
                "baseball", "soccer", "soccer" };

        Map<String, Integer> map = new HashMap<>();

        for (String sports : someSports) {
            Integer count = map.get(sports);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(sports, count);
        }

        String manySports = null;
        Integer max = Integer.MIN_VALUE;
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            if (max <= map.get(key)) {
                max = map.get(key);
                manySports = key;
            }
        }

        System.out.println("最も出現回数の多いスポーツは " + manySports + " で、出現回数は " + max + " 回です");
    }
}
