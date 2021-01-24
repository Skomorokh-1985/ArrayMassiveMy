package my_dude_array.array_dudes;

import java.util.Scanner;

public class Car implements Cost {

    private int year;
    private int cost;
    private String mark;

    public Car() {
    }

    public Car(int year, int cost, String mark) {
        this.year = year;
        this.cost = cost;
        this.mark = mark;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    Car createCar () {
        Car bufCar = new Car();
        System.out.print("Enter the year of manufacture of the car");
        Scanner scan = new Scanner(System.in);
        bufCar.year = scan.nextInt();
        System.out.print("Enter the cost of the car");
        bufCar.cost = scan.nextInt();
        System.out.print("Enter the mark of the car");
        scan = new Scanner(System.in);
        bufCar.mark = scan.nextLine();
        return bufCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", cost=" + cost +
                ", mark='" + mark + '\'' +
                '}';
    }
}
