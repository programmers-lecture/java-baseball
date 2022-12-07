package numberBaseball;

import game.Element;

import java.util.List;

public interface Parser<T>{
    List<Element<T>> parse(String str);
}
