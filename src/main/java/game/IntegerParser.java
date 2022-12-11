package game;

import baseball.Element;

import java.util.ArrayList;
import java.util.List;

public class IntegerParser implements Parser<Integer>{
    @Override
    public List<Element<Integer>> parse(String str) {
        List<Element<Integer>> result = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            result.add(new Element<>(i, Integer.parseInt(String.valueOf(str.charAt(i)))));
        }
        return result;
    }
}
