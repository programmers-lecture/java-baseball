package model;

public class FixedNumberGenerator implements NumberGenerator {

    private static  String FIXEDNUM = "123";
    String[] FIXEDNUM_ARR = FIXEDNUM.split("");

    @Override
    public String[] generate() {
        return FIXEDNUM_ARR;
    }

}
