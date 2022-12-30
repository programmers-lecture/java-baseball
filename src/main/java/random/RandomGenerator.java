package random;

import baseball.Element;

public interface RandomGenerator<T> {
    Element<T> generate(Integer position);
}
