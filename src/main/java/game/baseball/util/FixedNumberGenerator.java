package game.baseball.util;

import game.baseball.view.input.InputHandler;

import java.util.Optional;

public class FixedNumberGenerator implements NumberGenerator {

    @Override
    public int generate(int numberSize, int minNumber, int maxNumber) {
        return Integer.parseInt(Optional
                .ofNullable(InputHandler.readLine())
                .orElseThrow(() -> new NumberFormatException("올바르지 않은 포맷입니다."))); // TODO : Exception 관리
    }

}
