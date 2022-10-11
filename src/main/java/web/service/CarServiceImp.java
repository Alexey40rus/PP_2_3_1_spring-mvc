package web.service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("mazda", "red", 2));
        cars.add(new Car("mazda","black", 3));
        cars.add(new Car("mazda","brown", 4));
        cars.add(new Car("mazda","green", 5));
        cars.add(new Car("mazda","blue", 6));
    }

    @Override
    public List<Car> listCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
