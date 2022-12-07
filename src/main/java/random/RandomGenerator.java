package random;

import game.Element;

public interface RandomGenerator<T> {
    Element<T> generate(Integer position);
}
