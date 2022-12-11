package game;

import game.hit.Hit;
import game.hit.HitBall;
import game.hit.HitNone;
import game.hit.HitStrike;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Element<T> {
    private Integer position;
    private T value;

    public Hit beHit(Element<T> other){
        if(!this.isValueMatched(other)) return new HitNone();
        if(!this.isPositionMatched(other)) return new HitBall();
        return new HitStrike();
    }

    private boolean isPositionMatched(Element<T> other){
        return position.equals(other.position);
    }
    private boolean isValueMatched(Element<T> other){
        return value.equals(other.value);
    }
}
