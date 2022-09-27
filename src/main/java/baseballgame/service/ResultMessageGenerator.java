package baseballgame.service;

import baseballgame.model.GameStatus;

public class ResultMessageGenerator {
    private static final String BALL_LITERAL = "볼";
    private static final String STRIKE_LITERAL = "스트라이크";
    private static final String NOTHING_LITERAL = "낫싱";
    private static final String BLANK_LITERAL = " ";

    public String createNewResultMessage() {
        if (GameStatus.isNothing()) {
            return NOTHING_LITERAL;
        }
        return createNewBallsAndStrikesMessage();
    }

    private String createNewBallsAndStrikesMessage() {
        StringBuilder ballStrikeMessage = new StringBuilder();

        if (GameStatus.isNonZero(GameStatus.BALL)) {
            addLiteralByGameStatus(ballStrikeMessage, GameStatus.BALL, BALL_LITERAL);
            ballStrikeMessage.append(BLANK_LITERAL);
        }
        if (GameStatus.isNonZero(GameStatus.STRIKE)) {
            addLiteralByGameStatus(ballStrikeMessage, GameStatus.STRIKE, STRIKE_LITERAL);
        }

        return ballStrikeMessage.toString();
    }

    private void addLiteralByGameStatus(StringBuilder ballStrikeMessage, GameStatus type, String literal) {
        ballStrikeMessage.append(type.getState());
        ballStrikeMessage.append(literal);
    }
}
