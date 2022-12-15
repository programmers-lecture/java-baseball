package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 3자리 랜덤값 생성
public class RandomValue {

    Random random = new Random();
    List<Integer> ranNum = new ArrayList<>(3);

    // 중복된 수가 들어가지 않게 한다.
    public List<Integer> answerNum() {

        ranNum.clear();
        ranNum.add(0, random.nextInt(9));
        for(int i=1; i<3; i++) {
            int ranValue = random.nextInt(9);
            if(ranValue == ranNum.get(i-1)) i--;
            else ranNum.add(i, ranValue);
        }
        return ranNum;
    }
}
