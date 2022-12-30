package application.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedNumberGenerator implements NumberGenerator {
    @Override
    public List<Integer> generate() {
        return new ArrayList<>(Arrays.asList(1,2,3));
    }
}
