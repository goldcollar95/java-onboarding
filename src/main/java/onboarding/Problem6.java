package onboarding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
//        List<String> answer = List.of("answer");
// 정확하게 구현할 수 있을 때 까지 한다.
        HashSet<String> set = new HashSet<>();
        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < forms.size(); i++){
            String email = forms.get(i).get(0);
            String name = forms.get(i).get(1);

            for(int j = 0; j < name.length() - 1; j++){
                String key = name.substring(j, j+2);

                if(map.containsKey(key)){
                    set.add(map.get(key));      //중복을 허락하지않고 정렬이 필요없는 경우 HashSet을 이용한다.
                    set.add(email);
                }else{
                    map.put(key, email);
                }
            }
        }
        List<String> answer = set.stream().sorted().collect(Collectors.toList());
        return answer;
    }
}
