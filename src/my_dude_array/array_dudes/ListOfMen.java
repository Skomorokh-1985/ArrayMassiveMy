package my_dude_array.array_dudes;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfMen {

    private Man[] myArrayMEN;

    public ListOfMen(Man[] myArrayMEN) {
        this.myArrayMEN = myArrayMEN;
    }

    public ListOfMen() {
    }

    ListOfMen createArrayMen() {
        ListOfMen buffListOfMen = new ListOfMen();

        ArrayList<Man> bufArrayListMEN = new ArrayList<>();
        int number = 0;

        while (true) {

            System.out.print("Do you want to add a man? 1 - yes; 2-no.");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            if (choice == 1) {
                bufArrayListMEN.add(new Man());
                System.out.print("Enter a name of Man:");
                scan = new Scanner(System.in);
                bufArrayListMEN.get(number).name = scan.nextLine();
                System.out.print("Enter a age of Man:");
                bufArrayListMEN.get(number).age = scan.nextInt();
                bufArrayListMEN.get(number).car = new Car().createCar();
                bufArrayListMEN.get(number).camera = new Camera().createCamera();
                bufArrayListMEN.get(number).phone = new Phone().createPhone();
                bufArrayListMEN.get(number).bicycle = new Bicycle().createBicycle();
                bufArrayListMEN.get(number).flat = new Flat().createFlat();
                number++;
            } else {
                break;
            }
        }

        Man[] buffArrayMan = new Man[bufArrayListMEN.size()];
        for (int i = 0; i < bufArrayListMEN.size(); i++) {
            buffArrayMan[i] = bufArrayListMEN.get(i);
        }

        buffListOfMen.myArrayMEN = buffArrayMan;
        return buffListOfMen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        sb.append("\nListOfMen{myArrayMEN=");
        for (Man man : myArrayMEN) {
            sb.append("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            sb.append("\nname=" + man.name + ", age=" + man.age + ", flat=" + man.flat.toString() +
                    "\n, car=" + man.car.toString() + ", phone=" + man.phone.toString() + ", camera = "
                    + man.camera.toString() + ", bicycle=" + man.bicycle.toString());
        }
        return sb.toString();
    }

    public void getAllCost(ListOfMen listOfMen) {
        System.out.println("------------method getAllCost-------------");
        int[] allCost = new int[listOfMen.myArrayMEN.length];
        for (int i = 0; i < allCost.length; i++) {
            allCost[i] = listOfMen.myArrayMEN[i].flat.getCost() + listOfMen.myArrayMEN[i].flat.getTv().getCost() +
                    listOfMen.myArrayMEN[i].flat.getCooker().getCost() + listOfMen.myArrayMEN[i].flat.getWashingMachine().getCost() +
                    listOfMen.myArrayMEN[i].car.getCost() + listOfMen.myArrayMEN[i].camera.getCost()
                    + listOfMen.myArrayMEN[i].phone.getCost() + listOfMen.myArrayMEN[i].bicycle.getCost();
            System.out.println(" All financial recurse man " + listOfMen.myArrayMEN[i].name + " = " + allCost[i]);
        }
    }
}








        /*Object[][] objectMatrix = new Object[listOfMen.myArrayMEN.length][10];

        for (int i = 0; i < objectMatrix.length; i++) {
            for (int j = 0; j < objectMatrix[i].length; j++) {
                int number = 0;
                objectMatrix[i][number++] = listOfMen.myArrayMEN[i].flat;
                objectMatrix[i][number++] = listOfMen.myArrayMEN[i].flat.getTv();
                objectMatrix[i][number++] = listOfMen.myArrayMEN[i].flat.getWashingMachine();
                objectMatrix[i][number++] = listOfMen.myArrayMEN[i].flat.getCooker();
                objectMatrix[i][number++] = listOfMen.myArrayMEN[i].car;
                objectMatrix[i][number++] = listOfMen.myArrayMEN[i].phone;
                objectMatrix[i][number++] = listOfMen.myArrayMEN[i].camera;
                objectMatrix[i][number++] = listOfMen.myArrayMEN[i].bicycle;
            }
        }

        int k1 = listOfMen.myArrayMEN[0].flat.getCost();
        int k2 = listOfMen.myArrayMEN[0].getFlat().getCost();
        int k3 = listOfMen.myArrayMEN[0].getFlat().getCost();

        int k3 = objectMatrix[0][0].

        objectMatrix[0][0] = listOfMen.myArrayMEN[0].flat;
        int k2 = (objectMatrix[0][0].


        int[] costAllThings = new int[listOfMen.myArrayMEN.length];
        for (int i = 0; i < costAllThings.length; i++) {
            costAllThings[i] = 0;
            for (int j = 0; j < objectMatrix[i].length; i++) {
                costAllThings[i] += (objectMatrix[i][j]).
            }

            return objectMatrix*/

