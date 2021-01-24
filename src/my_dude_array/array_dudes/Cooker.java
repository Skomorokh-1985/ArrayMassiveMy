package my_dude_array.array_dudes;

import java.util.Scanner;

public class Cooker implements Cost {

    private int year;
    private int cost;
    private String mark;

    public Cooker() {
    }

    public Cooker(int year, int cost, String mark) {
        this.year = year;
        this.cost = cost;
        this.mark = mark;
    }

    Cooker createCooker () {
        Cooker buffCooker = new Cooker();
        System.out.print("Enter the year of manufacture of the cooker");
        Scanner scan = new Scanner(System.in);
        buffCooker.year = scan.nextInt();
        System.out.print("Enter the cost of the cooker");
        buffCooker.cost = scan.nextInt();
        System.out.print("Enter the mark of the cooker");
        scan = new Scanner(System.in);
        buffCooker.mark = scan.nextLine();
        return buffCooker;
    }

    @Override
    public String toString() {
        return "Cooker{" +
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
