package baseball;

import java.util.List;

public class Strike {
    private int len;

    public Strike(int len) {
        this.len = len;
    }

    public int count(List<String> computer, List<String> user) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(checkStrike(i, computer, user)) {
                count++;
            }
        }
        return count;
    }

    public boolean checkStrike(int index, List<String> computer, List<String> user) {
        return computer.get(index).equals(user.get(index));
    }
}
