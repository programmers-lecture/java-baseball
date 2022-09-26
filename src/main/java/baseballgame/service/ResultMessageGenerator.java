package baseballgame.service;

import baseballgame.model.GameStatus;

public class ResultMessageGenerator {
    private static final String NOTHING_LITERAL = "낫싱";
    private static final String BALL_LITERAL = "볼";
    private static final String STRIKE_LITERAL = "스트라이크";
    private static final String BLANK_LITERAL = " ";

    public String generateJudgmentMessage() {
        if (GameStatus.isNothing()) {
            return NOTHING_LITERAL;
        }

        return generateBallStrikeMessage();
    }

    private String generateBallStrikeMessage() {
        StringBuilder ballStrikeMessage = new StringBuilder();

        if (!GameStatus.isZero(GameStatus.BALL)) {
            ballStrikeMessage.append(GameStatus.BALL.getState());
            ballStrikeMessage.append(BALL_LITERAL);
            ballStrikeMessage.append(BLANK_LITERAL);
        }

        if (!GameStatus.isZero(GameStatus.STRIKE)) {
            ballStrikeMessage.append(GameStatus.STRIKE.getState());
            ballStrikeMessage.append(STRIKE_LITERAL);
        }

        return ballStrikeMessage.toString();
    }
}
