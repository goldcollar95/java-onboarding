package onboarding;

import java.util.Stack;

public class Problem2 {


    public static String solution(String cryptogram) {
        String answer = "";
        Stack<Character> stringStack = new Stack<>();

        for(int index = 0; index < cryptogram.length(); index++){
            if(stringStack.isEmpty()){
                stringStack.push(cryptogram.charAt(index));
            }
            else if(stringStack.peek() == cryptogram.charAt(index)){
                stringStack.pop();
            }else{
                stringStack.push(cryptogram.charAt(index));
            }
        }

        while( !stringStack.isEmpty()){
            answer = stringStack.pop() + answer;
        }

        return answer;
    }
}
