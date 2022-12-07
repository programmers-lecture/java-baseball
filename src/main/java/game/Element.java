package game;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Element<T> {
    private Integer position;
    private T value;

    public boolean isPositionMatched(Element<T> other){
        return position.equals(other.position);
    }
    public boolean isValueMatched(Element<T> other){
        return value.equals(other.value);
    }
}
