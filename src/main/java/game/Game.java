package game;

import numberBaseball.Setting;
import random.RandomGenerator;

import java.util.List;

public class Game<T>{
    enum Hit{
        BALL, STRIKE, NONE
    }
    private final Answer<T> answer;
    public Game(RandomGenerator<T> randomGenerator){
        answer = new Answer<>(Setting.MAX_NUMBER_OF_ELEMENTS);
        for(int i=0;i<answer.getMaxNumberOfElements();i++){
            answer.addElement(randomGenerator.generate(i));
        }
    }
    private Hit makeHit(Element<T> left, Element<T> right){
        if(!left.isValueMatched(right)) return Hit.NONE;
        if(!left.isPositionMatched(right)) return Hit.BALL;
        return Hit.STRIKE;
    }
    public Result tryNew(List<Element<T>> tries){
        Result result = Result.createNewResult(answer.getMaxNumberOfElements());
        for (Element<T> element : answer.getElements()) {
            for (Element<T> t : tries) {
                Hit hit = makeHit(element, t);
                if(hit==Hit.NONE) continue;
                if(hit==Hit.BALL) result.increaseBalls();
                if(hit==Hit.STRIKE) result.increaseStrikes();
            }
        }
        return result;
    }
}
