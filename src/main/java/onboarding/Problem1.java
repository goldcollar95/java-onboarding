package onboarding;


import java.util.List;

class Problem1 {


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

    public int addMax(List<Integer> pobi, List<Integer> crong){

        int pobileft = pobi.get(0);
        int pobiright = pobi.get(1);

        int crongleft = crong.get(0);
        int crongright = crong.get(1);

        int leftSum = 0;
        int rightSum = 0;

        while( pobileft != 0){
            leftSum += pobileft % 10;
            pobileft /= 10;
        }
        while( pobiright != 0){
            rightSum += pobiright % 10;
            pobiright /= 10;
        }

        while( crongleft != 0){
            leftSum += crongleft % 10;
            crongleft /= 10;
        }

        while( crongright != 0){
            rightSum += crongright % 10;
            crongright /= 10;
        }

        if(leftSum > rightSum){
            return leftSum;
        }else{
            return rightSum;
        }
    }

    public int MultipleMax(List<Integer> pobi, List<Integer> crong){

        int pobileft = pobi.get(0);
        int pobiright = pobi.get(1);

        int crongleft = crong.get(0);
        int crongright = crong.get(1);

        int leftMultiple = 0;
        int rightMultiple = 0;

        for(int i = 0; i < pobileft; i++){
            int hen = (i % 1000) / 100;
            int ten = (i % 100) / 10;
            int one = i % 10;

            if(hen != 0){
                leftMultiple = ten * one;
            }
            else{
                leftMultiple = hen * ten * one;
            }
        }

        for(int j = 0; j < pobiright; j++){
            int hen = (j % 1000) / 100;
            int ten = (j % 100) / 10;
            int one = j % 10;

            if(hen != 0){
                rightMultiple = ten * one;
            }
            else{
                rightMultiple = hen * ten * one;
            }
        }

        for(int i = 0; i < crongleft; i++){
            int hen = (i % 1000) / 100;
            int ten = (i % 100) / 10;
            int one = i % 10;

            if(hen != 0){
                rightMultiple =  ten * one;
            }
            else{
                rightMultiple = hen * ten * one;
            }
        }

        for(int j = 0; j < crongright; j++){
            int hen = (j % 1000) / 100;
            int ten = (j % 100) / 10;
            int one = j % 10;

            if(hen != 0){
                rightMultiple = ten * one;
            }
            else{
                rightMultiple = hen * ten * one;
            }
        }

        if(leftMultiple > rightMultiple){
            return leftMultiple;
        }else{
            return rightMultiple;
        }

    }
}