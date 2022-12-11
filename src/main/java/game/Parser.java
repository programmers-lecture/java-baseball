package game;

import baseball.Element;

import java.util.List;

public interface Parser<T>{
    List<Element<T>> parse(String str);
}
