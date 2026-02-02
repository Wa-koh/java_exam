import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        String random1, random2, random3;

        random1 = String.valueOf((int) Math.floor(Math.random() * 10));
        do {
            random2 = String.valueOf((int) Math.floor(Math.random() * 10));
        } while (random1 == random2);
        do {
            random3 = String.valueOf((int) Math.floor(Math.random() * 10));
        } while (random3 == random1 || random3 == random2);

        List<String> list = new ArrayList<>();
        String str1 = random1;
        String str2 = random2;
        String str3 = random3;
        String result = str1 + str2 + str3;
        list.add(result);

        str2 = random3;
        str3 = random2;
        result = str1 + str2 + str3;
        list.add(result);

        str1 = random2;
        str2 = random1;
        str3 = random3;
        result = str1 + str2 + str3;
        list.add(result);

        str2 = random3;
        str3 = random1;
        result = str1 + str2 + str3;
        list.add(result);

        str1 = random3;
        str2 = random1;
        str3 = random2;
        result = str1 + str2 + str3;
        list.add(result);

        str2 = random2;
        str3 = random1;
        result = str1 + str2 + str3;
        list.add(result);

        for (String num : list) {
            System.out.println(num);
        }
    }
}
