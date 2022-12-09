package model;

public class FixedNumberGenerator implements NumberGenerator {

    private static final String FIXEDNUM = "123";

    @Override
    public String generate() {
        return FIXEDNUM;
    }

}
