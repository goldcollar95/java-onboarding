package onboarding;

public class Problem2 {


    public static String solution(String cryptogram) {
        String answer = "";
        return String.valueOf(wordRemove((cryptogram)));

        //
        /*String[] alpabetCollection = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        //
        for(char i='a'; i<='z'; i++) {
        }

        //
//        List<String> alpabets = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
        List<String> alpabets = Arrays.asList("b","r","o","w","o","a","n","o","o","m","n","a","o","n");
        // 이 위의 과정을 줄여서 안에 담아낼수 있는 방법이 없을까? -> StringBulider.. Stack.. Method 분리
        Set<String> set = new HashSet<String>(alpabets);
        List<String> newList =new ArrayList<String>(set);

        answer = String.valueOf(newList);
        return answer;*/
    }
    //안에 담아놓고 분리를 해보자.
    public static StringBuffer wordRemove(String answer){
        StringBuffer sb = new StringBuffer(answer);
        for(int i = 0; i< sb.length() - 1; i++){
            if(sb.charAt(i) == sb.charAt(i + 1)){
                sb = sb.deleteCharAt(i);
                sb = sb.deleteCharAt(i);
                sb = wordRemove(String.valueOf(sb));
            }
        }
        return sb;
    }
}
