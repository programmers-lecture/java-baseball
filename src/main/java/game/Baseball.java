package game;

import game.answer.Answer;
import numberBaseball.Setting;
import random.RandomGenerator;

import java.util.List;

public class Baseball<T>{
    private final Answer<T> answer;
    public Baseball(RandomGenerator<T> randomGenerator){
        answer = new Answer<>(Setting.MAX_NUMBER_OF_ELEMENTS);
        for(int i=0;i<answer.getMaxNumberOfElements();i++){
            answer.addElement(randomGenerator.generate(i));
        }
    }

    public Result tryNew(List<Element<T>> tries){
        Result result = Result.createNewResult(answer.getMaxNumberOfElements());
        for (Element<T> element : answer.getElements()) {
            for (Element<T> t : tries) {
                element.beHit(t).update(result);
            }
        }
        return result;
    }
}
