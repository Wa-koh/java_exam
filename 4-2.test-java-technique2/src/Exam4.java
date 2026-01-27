import java.util.HashMap;
import java.util.Map;

public class Exam4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("東京", "東京");
        map.put("埼玉", "さいたま");
        map.put("茨城", "水戸");
        map.put("沖縄", "那覇");

        String key = "埼玉";
        String value = map.get(key);
        System.out.println(key + "の県庁所在地は「" + value + "」です");
        String key2 = "沖縄";
        String value2 = map.get(key2);
        System.out.println(key2 + "の県庁所在地は「" + value2 + "」です");
    }
}
