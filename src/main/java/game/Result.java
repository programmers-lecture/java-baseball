package game;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Result {
    private final Integer maxStrikes;
    private Integer balls;
    private Integer strikes;

    public static Result createNewResult(Integer maxStrikes){
        return new Result(maxStrikes, 0, 0);
    }

    public void increaseBalls(){
        this.balls++;
    }

    public void increaseStrikes(){
        this.strikes++;
    }

    public boolean isNothing(){
        return balls==0 && strikes==0;
    }

    public boolean isBall(){
        return this.balls!=0;
    }

    public boolean isStrike(){
        return this.strikes!=0;
    }

    public boolean isCorrect(){
        return maxStrikes.equals(strikes);
    }
}
