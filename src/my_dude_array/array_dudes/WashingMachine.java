package my_dude_array.array_dudes;

import java.util.Scanner;

public class WashingMachine implements Cost {

    private int year;
    private int cost;
    private String mark;

    public WashingMachine() {
    }

    public WashingMachine(int year, int cost, String mark) {
        this.year = year;
        this.cost = cost;
        this.mark = mark;
    }

   WashingMachine createWashingMachine () {
        WashingMachine buffWashingMachine = new WashingMachine();
        System.out.print("Enter the year of manufacture of the washingMachine");
        Scanner scan = new Scanner(System.in);
         buffWashingMachine.year = scan.nextInt();
        System.out.print("Enter the cost of the washingMachine");
        buffWashingMachine.cost = scan.nextInt();
        System.out.print("Enter the mark of the washingMachine");
        scan = new Scanner(System.in);
        buffWashingMachine.mark = scan.nextLine();
        return buffWashingMachine;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
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
