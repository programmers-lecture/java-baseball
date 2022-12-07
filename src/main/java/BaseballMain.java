import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BaseballMain {
    public static void main(String[] args) {
        IntStream ints = new Random().ints(0,10);
        List<String> list = ints.distinct().limit(3).boxed().map(Object::toString).collect(Collectors.toList());
        System.out.println(list);
            Scanner scan = new Scanner(System.in);
        List list2 = new LinkedList();
        int strike = 0;
        int ball = 0;
        while (true) {
            list2 = new LinkedList();
            strike = 0;
            ball= 0;
            System.out.print("숫자를 입력해주세요 : ");
            String str = scan.nextLine();
            list2 = Arrays.stream(str.split("")).collect(Collectors.toList());
            //스트라이크
            for(int i =0;i<list.size();i++) {
                if(list.get(i).equals(list2.get(i))) {
                    strike++;
                }
            }

            //볼
            list2.retainAll(list);
            ball = list2.size() - strike;

            if(strike ==0 && ball ==0 ) System.out.println("낫싱");
            else System.out.println(ball + "볼 " + strike + "스트라이크");

            if(strike == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                String next = scan.nextLine();

                if(next.equals("1")) continue;
                if(next.equals("2")) break;

            }
        }









    }
}
