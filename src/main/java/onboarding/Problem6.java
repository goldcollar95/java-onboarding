package onboarding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
//        List<String> answer = List.of("answer");

        HashSet<String> set = new HashSet<>(); //중복방지
        Map<String, String> map = new HashMap<>();  //닉네임 , 이메일 주소

        for(int i = 0; i < forms.size(); i++){
            String email = forms.get(i).get(0);
            String name = forms.get(i).get(1);

            for(int j = 0; j < name.length() - 1; j++){
                String key = name.substring(j, j+2);

                if(map.containsKey(key)){
                    set.add(map.get(key));
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
