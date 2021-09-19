package exercises.technology.test;

import exercises.technology.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer testComputer;

    @Before
    public void createComputer() {
        testComputer = new Computer("Mac", 4, "Reagan");
    }

    @Test
    public void defaultComputerIsOff() {
        assertEquals(false, testComputer.getOn());
    }

    @Test
    public void turnComputerOnWorks() {
        testComputer.turnOn();
        assertEquals(true, testComputer.getOn());
    }

    @Test
    public void turnComputerOffWorks() {
        testComputer.turnOff();
        assertEquals(false, testComputer.getOn());
    }
}
