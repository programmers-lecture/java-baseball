package application.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {

    @Test
    public void 고정넘버생성_Test() {
        Computer computer = new Computer();
        computer.createAnswerWithFixed();

        assertEquals("[1, 2, 3]",computer.getAnswer().toString());
    }
}
