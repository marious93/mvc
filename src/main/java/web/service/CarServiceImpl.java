package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

@Service
public class CarServiceImpl implements CarService {

    private final UserDao userDao;
    private List<Car> carList;


    public CarServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Car> getCarList(Integer number) {
        carList = userDao.createNewList();
        return carList.stream().limit(number).toList();
    }

}
