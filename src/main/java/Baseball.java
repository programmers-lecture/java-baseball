import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;


public class Baseball {
    public static void main(String[] args) {

        //준비 :  3개의 중복없는 난수가 담긴 list를 생성한다.
        Set<Integer> set = new HashSet<Integer>();
        Random rand = new Random();

        while (set.size() < 3) {
            int num = rand.nextInt(10);
            set.add(num);
        }


        ArrayList<Integer> randomList = new ArrayList<Integer>(set);
        Integer[] inputList = new Integer[3];
        //ArrayList<Integer> inputList    = new ArrayList<Integer>(3); 이렇게 사용하면 아래에서 out of bound 에러가 발생한다...이유를 알고싶습니다.
        System.out.println("생성된 숫자 : " + randomList);

        //시작 : 사용자로부터 3개의 숫자를 입력받는다.
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < randomList.size(); i++) {
            System.out.print(i + 1 + "번 째 숫자를 입력하세요");
            int num = sc.nextInt();


            inputList[i] = num;
        }

        System.out.println("입력한 숫자 : " + Arrays.asList(inputList));

        sc.close();

        int strike = 0;
        int ball   = 0;

        //만약 자동 생성된 난수와 사용자의 입력값을 set에 담았을 때 길이가 6이라면 하나도 맞추지 못했기 때문에 out 처리한다.
        HashSet<Integer> isThereDuplicates = new HashSet<Integer>();

        isThereDuplicates.addAll(Arrays.asList(inputList));
        isThereDuplicates.addAll(randomList);

        System.out.println("중복된 숫자 : " + isThereDuplicates);

        if(isThereDuplicates.size() == 6) {
            System.out.println("Out! 하나도 맞추지 못하셨네요~!");
        } else {
            for (int i = 0; i < randomList.size(); i++) {
                for (int j = 0; j < inputList.length; j++) {
                    if (randomList.get(i) == inputList[j]) {
                        if (i == j) {
                            System.out.println("strike");
                            strike++;
                        } else {
                            System.out.println("ball");
                            ball++;
                        }
                    }
                }

            }
            System.out.println(strike + ": strike(s) " + ball + " : ball(s)");
        }



    }
}
