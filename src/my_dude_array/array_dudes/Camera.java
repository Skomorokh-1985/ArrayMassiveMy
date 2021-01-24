package my_dude_array.array_dudes;

import java.util.Scanner;

public class Camera implements Cost {

    private int year;
    private int cost;
    private String mark;

    public Camera(int year, int cost, String mark) {
        this.year = year;
        this.cost = cost;
        this.mark = mark;
    }

    public Camera() {
    }

    Camera createCamera () {
        Camera bufCamera = new Camera();
        System.out.print("Enter the year of manufacture of the camera");
        Scanner scan = new Scanner(System.in);
        bufCamera.year = scan.nextInt();
        System.out.print("Enter the cost of the camera");
        bufCamera.cost = scan.nextInt();
        System.out.print("Enter the mark of the camera");
        scan = new Scanner(System.in);
        bufCamera.mark = scan.nextLine();
        return bufCamera;
    }

    @Override
    public String toString() {
        return "Camera{" +
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
