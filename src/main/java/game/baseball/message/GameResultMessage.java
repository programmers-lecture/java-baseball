package game.baseball.message;

import game.baseball.hint.Hints;

import java.util.function.Function;

public enum GameResultMessage {
    LOSE(GameResultMessage::createHintMessage),
    WIN(GameResultMessage::createWinMessage);

    private final Function<Hints, String> message;

    GameResultMessage(Function<Hints, String> message) {
        this.message = message;
    }

    public static String getHintMessage(GameResultMessage hintMessage, Hints hints) {
        return hintMessage.createMessage(hints);
    }

    private String createMessage(Hints hints) {
        return this.message.apply(hints);
    }

    private static String createWinMessage(Hints hints) {
        return hints.getStrikeHint().getScore() + "개의 숫자를 모두 맞히셨습니다! 게임 종료";
    }

    private static String createHintMessage(Hints hints) {
        StringBuilder sb = new StringBuilder();
        if (hints.getBallHint().getScore() != 0) {
            sb.append(hints.getBallHint().getScore())
                    .append(hints.getBallHint().getName())
                    .append(" ");
        }
        if (hints.getStrikeHint().getScore() != 0) {
            sb.append(hints.getStrikeHint().getScore())
                    .append(hints.getStrikeHint().getName());
        }
        if(hints.getNotingHint().getScore() != 0) {
            sb.append(hints.getNotingHint().getName());
        }
        return sb.append("\n").toString();
    }
}
