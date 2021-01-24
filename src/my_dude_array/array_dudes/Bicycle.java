package my_dude_array.array_dudes;

import java.util.Scanner;

public class Bicycle implements Cost {

    private int year;
    private int cost;
    private String mark;

    public Bicycle() {
    }

    public Bicycle(int year, int cost, String mark) {
        this.year = year;
        this.cost = cost;
        this.mark = mark;
    }

    Bicycle createBicycle() {
        Bicycle buffBicycle = new Bicycle();
        System.out.print("Enter the year of manufacture of the bicycle");
        Scanner scan = new Scanner(System.in);
        buffBicycle.year = scan.nextInt();
        System.out.print("Enter the cost of the bicycle");
        buffBicycle.cost = scan.nextInt();
        System.out.print("Enter the mark of the bicycle");
        scan = new Scanner(System.in);
        buffBicycle.mark = scan.nextLine();
        return buffBicycle;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "year=" + year +
                ", cost=" + cost +
                ", mark='" + mark + '\'' +
                '}';
    }

    @Override
    public int getCost() {
        return cost;
    }
}
