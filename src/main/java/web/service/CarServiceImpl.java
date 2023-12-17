package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{


    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Запорожец ЗАЗ", 1969, "синий"));
        cars.add(new Car("Пирожковоз ИЖ-2715", 1972, "зеленый"));
        cars.add(new Car("ЗИЛ-114", 1977, "черный"));
        cars.add(new Car("Волга ГАЗ-3102", 1985, "черный"));
        cars.add(new Car("БЕЛАЗ ", 1989, "желтый"));
    }


    @Override
    public List<Car> getListByNumberOfCars(int amount) {
        if(amount >=5 ) return cars;
        List<Car> newListCars = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            newListCars.add(cars.get(i));
        }
        return newListCars;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
