import java.util.*;


public class Baseball {
    public static void main(String[] args) {

        ArrayList<Integer> randomList = createRandomNumList();

        Integer[] inputList = saveUserInputs(randomList.size());

        int isContinue = printResult(randomList, inputList);

        if (isContinue == 1) {
            main(null);
        } else {
            System.out.println("게임을 종료합니다.");
        }
    }


    //중복이 없는 3개의 랜덤 숫자를 담은 배열을 반환하는 함수.
    public static ArrayList createRandomNumList() {
        //준비 :  3개의 중복없는 난수가 담긴 list를 생성한다.
        Set<Integer> set = new HashSet<Integer>();
        Random rand = new Random();

        while (set.size() < 3) {
            int num = rand.nextInt(10);
            set.add(num);
        }

        ArrayList<Integer> randomList = new ArrayList<Integer>(set);
        //System.out.println("생성된 숫자 : " + randomList);

        return randomList;
    }

    //사용자로부터 3개의 숫자를 입력받아 배열에 담아 반환하는 함수.
    public static Integer[] saveUserInputs(int randomListSize) {
        //시작 : 사용자로부터 3개의 숫자를 입력받는다.
        Integer[] inputList = new Integer[randomListSize];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < randomListSize; i++) {
            System.out.print(i + 1 + "번 째 숫자를 입력하세요 ");
            int num = sc.nextInt();

            inputList[i] = num;
        }

        //System.out.println("입력한 숫자 : " + Arrays.asList(inputList));

        return inputList;
    }

    public static int printResult(ArrayList<Integer> randomList, Integer[] inputList) {
        //만약 자동 생성된 난수와 사용자의 입력값을 set에 담았을 때 길이가 6이라면 하나도 맞추지 못했기 때문에 out 처리한다.
        HashSet<Integer> noDuplicates = new HashSet<Integer>();

        int strike = 0;
        int ball   = 0;

        noDuplicates.addAll(Arrays.asList(inputList));
        noDuplicates.addAll(randomList);

        //System.out.println("중복된 숫자 : " + noDuplicates);

        if(noDuplicates.size() == 6) {
            System.out.println("Out! 하나도 맞추지 못하셨네요~!");
        } else {
            for (int i = 0; i < randomList.size(); i++) {
                for (int j = 0; j < inputList.length; j++) {
                    if (randomList.get(i) == inputList[j]) {
                        if (i == j) {
                            //System.out.println("strike");
                            strike++;
                        } else {
                            //System.out.println("ball");
                            ball++;
                        }
                    }
                }
            }
            System.out.println(strike + ": strike(s) " + ball + " : ball(s)");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 다시 시작하시겠습니까? 1.예 2.아니오");

        return sc.nextInt();
    }
}
