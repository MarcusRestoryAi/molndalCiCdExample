import org.example.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CarTest {

    // Test prop
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car(0, "Grön");
    }

    @Test
    void BilStop() {
        Assertions.assertEquals(car.getVelocity(), 0);
    }

    @Test
    void BilAccelererar() {
        car.Accelerate(10);
        Assertions.assertEquals(car.getVelocity(), 10);

        car.Accelerate(10);
        Assertions.assertEquals(car.getVelocity(), 20);

        car.Accelerate(10);
        Assertions.assertEquals(car.getVelocity(), 30);
    }

    @Test
    void BilenSaktarNer() {
        car.setVelocity(50);

        car.Accelerate(-20);
        Assertions.assertEquals(car.getVelocity(), 30);

        car.Accelerate(-40);
        Assertions.assertEquals(car.getVelocity(), -10);
    }
}
