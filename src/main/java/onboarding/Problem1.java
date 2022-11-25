package onboarding;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem1 {


    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;


        List<Integer> pobiMax = new ArrayList<>();
        pobiMax.add(addMax(pobi));   // 70 vs 72 = 72
        pobiMax.add(MultipleMax(pobi));  // 7*2 = 14 / 8*2

        List<Integer>  crongMax = new ArrayList<>();
        crongMax.add(addMax(crong));
        crongMax.add(MultipleMax(crong));


        if(checkValidator(pobi) || checkValidator(crong)) return -1;
        if(Collections.max(pobiMax) > Collections.max(crongMax))  return 1;
        if(Collections.max(pobiMax) < Collections.max(crongMax))  return 2;
        if(Collections.max(pobiMax) == Collections.max(crongMax))  return 0;



        return answer;

    }

    public static boolean checkValidator(List<Integer> bookPage) {


       /* for(int index = 0; index < bookPage.size(); index++){
            if(bookPage.get(index) > 0 && bookPage.get(index) < 400)

            return true;
        }
        return false;
    }*/

        int left = bookPage.get(0);
        int right = bookPage.get(1);

        if (left == 1 || right == 400 || right - left != 1)
            return true;

        return false;
    }

    public boolean checkFrontBack(int bookPage){

        for(int index = 0 ; index < bookPage; index++){
            if(bookPage == 1 && bookPage == 400){

            }
        }
        return false;
    }

    public static int pobiMax(List<Integer> list) {
        int pobiLeft = list.get(0);
        int pobiright = list.get(1);

        if (pobiLeft > pobiright) {
            return pobiLeft;
        } else
            return pobiright;
    }

    public static int crongMax(List<Integer> list) {
        int crongLeft = list.get(0);
        int crongright = list.get(1);

        if (crongLeft > crongright) {
            return crongLeft;
        } else
            return crongright;
    }


    public static int addMax(List<Integer> Twolist){

        List<Integer> directionAll = new ArrayList<>();


        int left = Twolist.get(0);
        int right = Twolist.get(1);


        int leftSum = 0;
        int rightSum = 0;

        int crongleftSum = 0;
        int crongrightSum = 0;

        while( left != 0){
            leftSum += left % 10;
            left /= 10;
        }
        while( right != 0){
            rightSum += right % 10;
            right /= 10;
        }

        if(leftSum > rightSum){
            return leftSum;
        }else{
            return rightSum;
        }
    }

    public static int MultipleMax(List<Integer> Twolist){
        int hen = 0;
        int ten = 0;
        int one = 0;

        List<Integer> directionAll = new ArrayList<>();
        int left = Twolist.get(0); //98
        int right = Twolist.get(1);    //97
        int leftMultiple = 0;
        int rightMultiple = 0;

        for(int index = 0; index < left; index++) {
            hen = (index % 1000) / 100;
            ten = (index % 100) / 10;
            one = index % 10;

            if (hen == 0) {
                leftMultiple = ten * one;
            } else {
                leftMultiple = hen * ten * one;
            }

        }
        for(int second = 0; second < right; second++) {
            hen = (second % 1000) / 100;
            ten = (second % 100) / 10;
            one = second % 10;

            if (hen == 0) {
                rightMultiple = ten * one;
            } else {
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