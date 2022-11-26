package onboarding;

public class Problem3 {
    public static int solution(int number) {
    int answer = 0;
    for(int index = 0; index <= number; index++){
        String str = Integer.toString(index);
        for(int toString = 0; toString < str.length(); toString++){
            char chr = str.charAt((toString));
            if(chr == '3' || chr == '6' || chr == '9'){
                answer++;
            }
        }
    }
        return answer;
    }
}
