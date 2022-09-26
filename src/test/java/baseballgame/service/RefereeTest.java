package baseballgame.service;

import baseballgame.model.GameStatus;
import baseballgame.model.RandomNumber;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {
    private final Referee referee = new Referee();
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
}