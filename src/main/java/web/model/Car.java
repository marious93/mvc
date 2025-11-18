package web.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Car {
    private int id;
    private String name;
    private int price;
    private double speed;

    public Car() {
    }

    public Car(int id, String name, int price, double speed) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }

}
