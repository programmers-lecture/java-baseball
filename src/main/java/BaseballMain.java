import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BaseballMain {
    public static void main(String[] args) {

        // 1-9 임의의 수 3개 생성
        IntStream ints = new Random().ints(0,10);
        List<String> randomNum = ints.distinct().limit(3).boxed().map(Object::toString).collect(Collectors.toList());//랜덤 숫자

        Scanner scan = new Scanner(System.in);

        List inputNum = new LinkedList();// 입력받을 변수

        int strike = 0;// 스트라이크 개수 변수
        int ball = 0; // 볼 개수 변수

        while (true) {
            inputNum = new LinkedList();
            strike = 0;
            ball= 0;
            System.out.print("숫자를 입력해주세요 : ");
            String str = scan.nextLine();
            inputNum = Arrays.stream(str.split("")).collect(Collectors.toList());

            //입력 검증
            if(inputNum.stream().filter(num -> Character.isDigit(num.toString().charAt(0))).count() < 3 || inputNum.size() > 3) { //입력값이 숫자가 아닐때 || 입력이 4글자 이상일때
                throw new IllegalArgumentException("띄어쓰기 없이 숫자 3개를 입력해주세요");
            };



            //스트라이크 개수 세기 기능
            for(int i =0;i<randomNum.size();i++) {
                if(randomNum.get(i).equals(inputNum.get(i))) {
                    strike++;
                }
            }

            //볼 개수 세기 기능
            inputNum.retainAll(randomNum);
            ball = inputNum.size() - strike;

            // 결과 출력
            if(strike ==0 && ball == 0 ) System.out.println("낫싱");
            else System.out.println(ball + "볼 " + strike + "스트라이크");

            if(strike == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                String next = scan.nextLine();

                if(!"1".equals(next) || !"2".equals(next)) {
                    throw new IllegalArgumentException("1 또는 2를 입력해주세요");
                }
                if(next.equals("1")) continue;
                if(next.equals("2")) break;

            }
        }


    }


}
