package random;

import baseball.Element;

public class RandomIntegerGenerator implements RandomGenerator<Integer>{
    @Override
    public Element<Integer> generate(Integer position) {
        return new Element<>(position, (int)(Math.random()*10));
    }
}
