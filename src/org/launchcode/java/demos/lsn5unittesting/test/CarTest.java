package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;


public class CarTest {

    Car test_car;

    @Before
    public void c() {
        test_car = new Car("Toyota", "Parus", 10, 50);
    }

//    @After
//    public void method(){
//        test_car = new Car("Toyota", "Parus", 10, 50);
//    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, 0.001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), 0.001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevel() {
        test_car.drive(200);
        assertEquals(6, test_car.getGasTankLevel(), 0.001);
    }

    @Test
    public void testGasTankLevel1() {
        test_car.drive(200);
        assertTrue("true", test_car.getGasTankLevel() == 6);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), 0.001);
    }

    @Test
    public void testGasTankAfterDriving1() {
        test_car.drive(50);
        assertTrue("true", test_car.getGasTankLevel() == 9);
    }

    //TODO: can't have more gas than tank size, expect an exception

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}
