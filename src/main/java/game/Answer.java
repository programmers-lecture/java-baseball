package game;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Answer<T> {
    private final Integer maxNumberOfElements;
    private List<Element<T>> elements;

    public Answer(Integer maxNumberOfElements){
        this.maxNumberOfElements = maxNumberOfElements;
        this.elements = new ArrayList<>();
    }

    public void addElement(Element<T> element){
        if(3<elements.size()) throw new IllegalArgumentException();
        elements.add(element);
    }
}
