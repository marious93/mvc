package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @Override
    public List<Car> createNewList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Car1", 10, 1));
        carList.add(new Car(2, "Car2", 20, 2));
        carList.add(new Car(3, "Car3", 30, 3));
        carList.add(new Car(4, "Car4", 40, 4));
        carList.add(new Car(5, "Car5", 50, 5));
        return carList;
    }

}
