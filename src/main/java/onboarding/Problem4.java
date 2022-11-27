package onboarding;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        String[] list = {"Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A"};


        Map<String, String> check = new HashMap<>();

        for (int index = 0; index < list.length; index++) {
            check.put(Character.toString('A' + index), list[index]);

        }

        String[] arrSplice = word.split(" ");

        for (String c : arrSplice) {
            String reverse = check.get(c.toUpperCase());

            if (reverse == null) {
                reverse = " ";
            }
            if (!(Character.isUpperCase(c.charAt(0)))) {
                reverse = reverse.toLowerCase();
            }
            answer += reverse;
        }
        return answer;
    }
}
