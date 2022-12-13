import java.util.Random;
import java.util.Scanner;

public class Baseball {

    // 3자리 수 랜덤값 생성
    public static String randomValue() {

        Random random = new Random();
        String ranNum = "";

        for(int i=0; i<3; i++) {
            int createNum = random.nextInt(9);
            ranNum += Integer.toString(createNum);
        }

        return ranNum;
    }

    public static void main(String[] args) {

        String randomValue = randomValue();
        System.out.println(randomValue);

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

        }
    }
}
