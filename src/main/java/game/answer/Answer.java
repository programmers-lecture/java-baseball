package game.answer;

import game.Element;
import lombok.Getter;
import numberBaseball.Setting;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Answer<T> {
    private final Integer maxNumberOfElements;
    private final List<Element<T>> elements;

    public Answer(Integer maxNumberOfElements){
        this.maxNumberOfElements = maxNumberOfElements;
        this.elements = new ArrayList<>();
    }

    public void addElement(Element<T> element){
        if(Setting.MAX_NUMBER_OF_ELEMENTS<elements.size())
            throw new IllegalArgumentException();
        elements.add(element);
    }
}
