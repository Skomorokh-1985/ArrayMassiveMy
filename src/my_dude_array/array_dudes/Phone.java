package my_dude_array.array_dudes;

import java.util.Scanner;

public class Phone implements Cost {

    private int year;
    private int cost;
    private String mark;

    public Phone() {
    }

    public Phone(int year, int cost, String mark) {
        this.year = year;
        this.cost = cost;
        this.mark = mark;
    }

    Phone createPhone() {
        Phone buffPhone = new Phone();
        System.out.print("Enter the year of manufacture of the phone");
        Scanner scan = new Scanner(System.in);
        buffPhone.year = scan.nextInt();
        System.out.print("Enter the cost of the phone");
        buffPhone.cost = scan.nextInt();
        System.out.print("Enter the mark of the phone");
        scan = new Scanner(System.in);
        buffPhone.mark = scan.nextLine();
        return buffPhone;
    }

    @Override
    public String toString() {
        return "Phone{" +
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
