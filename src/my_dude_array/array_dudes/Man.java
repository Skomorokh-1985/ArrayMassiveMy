package my_dude_array.array_dudes;

import java.util.Objects;

public class Man {

    String name;
    int age;
    Flat flat;
    Car car;
    Phone phone;
    Camera camera;
    Bicycle bicycle;

    public Man(String name, int age, Flat flat, Car car, Phone phone, Camera camera, Bicycle bicycle) {
        this.name = name;
        this.age = age;
        this.flat = flat;
        this.car = car;
        this.phone = phone;
        this.camera = camera;
        this.bicycle = bicycle;
    }

    public Man() {

    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", flat=" + flat.toString() +
                ", car=" + car.toString() +
                ", phone=" + phone.toString() +
                ", camera=" + camera.toString() +
                ", bicycle=" + bicycle.toString() +
                '}';
    }


    public int mansBablos() {
        int bablos = flat.getCost() + flat.getTv().getCost() + flat.getCooker().getCost() + flat.getWashingMachine().getCost() +
                car.getCost() + camera.getCost() + phone.getCost() + bicycle.getCost();
        return bablos;
    }

    @Override
    public boolean equals(Object o) {
        Man o2 = (Man) o;
        System.out.println("----------method equals " + this.name + " and " + o2.name + "-----------");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.mansBablos() == ((Man) o).mansBablos();
    }

    @Override
    public int hashCode() {
        System.out.println("-----------method hashCode " + this.name + "------------");
        return Objects.hash(name, age, flat, car, phone, camera, bicycle);
    }
}
