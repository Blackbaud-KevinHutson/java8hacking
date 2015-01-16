import java.util.Arrays;
import java.util.List;

public class Other {
    public Other() {

        final Car car = Car.create(Car::new);

        final List<Car> cars = Arrays.asList(car);


    }
}
