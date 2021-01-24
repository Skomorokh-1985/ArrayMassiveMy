package my_dude_array.array_dudes;

import java.util.Scanner;

public class TV implements Cost {

    private int year;
    private int cost;
    private String mark;

    public TV() {
    }

    public TV(int year, int cost, String mark) {
        this.year = year;
        this.cost = cost;
        this.mark = mark;
    }

    TV createTV () {
        TV bufTV = new TV();
        System.out.print("Enter the year of manufacture of the TV");
        Scanner scan = new Scanner(System.in);
        bufTV.year = scan.nextInt();
        System.out.print("Enter the cost of the TV");
        bufTV.cost = scan.nextInt();
        System.out.print("Enter the mark of the TV");
        scan = new Scanner(System.in);
        bufTV.mark = scan.nextLine();
        return bufTV;
    }

    @Override
    public String toString() {
        return "TV{" +
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
