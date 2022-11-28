package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();

        // user의 친구를 구해보자.
        List<String> userFriends = new ArrayList<>();
        for(int i = 0; i < friends.size(); i++){
            Iterator it = friends.get(i).iterator();

            while(it.hasNext()){
                Object tmp = it.next();
                if(tmp.equals(user)){
                    userFriends.addAll((friends.get(i)));
                    userFriends.remove(user);
                }
            }
        }
        return answer;
    }
}

