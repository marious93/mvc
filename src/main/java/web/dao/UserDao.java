package web.dao;

import web.model.Car;

import java.util.List;

public interface UserDao {

    public List<Car> getList(List<Car> carList, Integer number);
    public List<Car> create();
}