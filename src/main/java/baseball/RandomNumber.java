package baseball;

import java.util.*;

public class RandomNumber {
    public List<String> generate() {
        Random random = new Random();
        List<String> result;
        do {
            result = List.of(String.valueOf(random.nextInt(999)).split(""));
        } while (!checkDuplicate(result) || result.size() != 3);
        return result;
    }

    private static boolean checkDuplicate(List<String> arr) {
        Set<String> set = new HashSet<>(arr);
        return set.size() == arr.size();
    }
}
