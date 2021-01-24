package my_dude_array.array_dudes;

import java.util.Scanner;

public class Flat implements Cost {

    private int year;
    private int cost;
    private TV tv;
    private WashingMachine washingMachine;
    private Cooker cooker;

    public Flat() {
    }

    public Flat(int year, int cost, TV tv, WashingMachine washingMachine, Cooker cooker) {
        this.year = year;
        this.cost = cost;
        this.tv = tv;
        this.washingMachine = washingMachine;
        this.cooker = cooker;
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

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public WashingMachine getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    public Cooker getCooker() {
        return cooker;
    }

    public void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }

    Flat createFlat() {
        Flat buffFlat = new Flat();
        System.out.print("Enter a year of flat:");
        Scanner scan = new Scanner(System.in);
        buffFlat.year = scan.nextInt();
        System.out.print("Enter a cost of flat:");
        buffFlat.cost = scan.nextInt();
        buffFlat.tv = new TV().createTV();
        buffFlat.cooker = new Cooker().createCooker();
        buffFlat.washingMachine = new WashingMachine().createWashingMachine();
        return buffFlat;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "year=" + year +
                ", cost=" + cost +
                ", tv=" + tv.toString() +
                ", washingMachine=" + washingMachine.toString() +
                ", cooker=" + cooker.toString() +
                '}';
    }
}

