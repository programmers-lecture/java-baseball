package game.baseball;

import game.baseball.game.GameHandler;

import static game.baseball.game.GameSetting.GAME_SETTING;

public class BaseballApplication {

    public static void main(String[] args) {
        GameHandler game = new GameHandler();

        game.playGame(
                GAME_SETTING.getComputerPlayer(),
                GAME_SETTING.getHumanPlayer(),
                false,
                0);
    }
}
