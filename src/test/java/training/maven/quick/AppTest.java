package training.maven.quick;

import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
    private final HolaMundo sut = new HolaMundo();

    @Test
    public void additionShouldAddTwoNumbers() {
        assertEquals(4, sut.addition(2, 2));
    }

    @Test
    public void subtractionShouldSubtractSecondNumberFromFirstNumber() {
        assertEquals(6, sut.subtraction(8, 2));
    }

    @Test
    public void multiplicationShouldMultiplyTwoNumbers() {
        assertEquals(32, sut.multiplication(8, 4));
    }

    @Test
    public void divisionShouldDivideFirstNumberWithTheSecond() {
        assertEquals(5,sut.division(40, 8));
    }
}
