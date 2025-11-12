package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private UserDao userDao;
    private  List<Car> carList;


    @Autowired
    public CarServiceImpl(UserDao userDao) {
        this.userDao = userDao;
        carList = userDao.createNewList();
    }

    @Override
    public List<Car> getCarList(Integer number) {
        if ((number == null) || (number >= 6)) {
            number = 5;
        }
        return carList.subList(0, number);
    }


}
