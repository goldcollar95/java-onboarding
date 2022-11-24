package onboarding;


import java.util.List;

class Problem1 {

    private static final int[] left_page = {};
    private final int[] right_page = {};
    private final int[] random_page = {};

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;

    }

    public boolean checkValidator(int bookPage){
        for(int index = 0; index < bookPage; index++){
            if(bookPage > 0 && bookPage < 400){
            }
            return true;
        }
        return false;
    }

    public boolean checkFrontBack(int bookPage){

        for(int index = 0 ; index < bookPage; index++){
            if(bookPage == 1 && bookPage == 400){

            }
        }
        return false;
    }

    public int pobiMax(List<Integer> pobiMax){
        int pobileft = 0;
        int pobiright = 0;

        for(int index = 0; index < pobiMax.size(); index++){
            if(pobileft == pobiMax.get(0) && pobiright == pobiMax.get(1)){
            }
            if(pobileft > pobiright){
                return pobileft;
            }
            if(pobileft < pobiright){
                return pobiright;
            }
        }
        return 0;
    }

    public int crongMax(List<Integer> crongMax){
        int crongleft = 0;
        int crongright = 0;

        for(int index = 0; index < crongMax.size(); index++){
            if(crongleft == crongMax.get(0) && crongright == crongMax.get(1)){
            }
            if(crongleft > crongright){
                return crongleft;
            }
            if(crongleft < crongright){
                return crongright;
            }
        }
        return 0;
    }
}