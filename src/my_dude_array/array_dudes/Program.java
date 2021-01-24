package my_dude_array.array_dudes;

public class Program {

    public static void main(String[] args) {

        //listOfMen listOfMen = new ArrayDudes().createArrayDudes();

        Man man0 = new Man("Ivan", 35, new Flat(1995, 30000, new TV(1997, 1000, "Horizont"),
                new WashingMachine(2010, 1000, "Bosch"), new Cooker(2010, 2000, "Vitiaz")),
                new Car(2010, 5000, "Ford"), new Phone(2020, 2000, "Iphone"),
                new Camera(2010, 1000, "Philips"), new Bicycle(1980, 5, "Aist"));

        Man man1 = new Man("Sergei", 45, new Flat(1998, 40000, new TV(1998, 1100, "Siemens"),
                new WashingMachine(2015, 500, "Indesit"), new Cooker(2020, 2000, "Bosch")),
                new Car(2020, 50000, "Ferrari"), new Phone(2019, 500, "Huawei"),
                new Camera(2015, 1500, "Nokia"), new Bicycle(2020, 1500, "Forsage"));

        Man man2 = new Man("Anton", 55, new Flat(2020, 60000, new TV(2010, 800, "Acer"),
                new WashingMachine(2020, 1000, "LG"), new Cooker(2010, 500, "LG")),
                new Car(2015, 15000, "Mercedes"), new Phone(2017, 300, "Motorola"),
                new Camera(2018, 3000, "Zenit"), new Bicycle(2018, 200, "Motovelo"));

        Man man3 = new Man("Mihail", 55, new Flat(1950, 20000, new TV(1990, 100, "TV"),
                new WashingMachine(), new Cooker(2000, 100, "unknown")), new Car(), new Phone(2015, 50, "Motorola"),
                new Camera(2000, 100, "unknown"), new Bicycle());

        Man[] myManArray = new Man[4];
        myManArray[0] = man0;
        myManArray[1] = man1;
        myManArray[2] = man2;
        myManArray[3] = man3;

        ListOfMen AD = new ListOfMen(myManArray);

        System.out.println(AD.toString());

        AD.getAllCost(AD);

        System.out.println(man0.equals(man1));

        System.out.println("--------method mansBablos + " + man0.name + "-----------");
        System.out.println(man0.mansBablos());
        System.out.println("--------method mansBablos + " + man1.name + "-----------");
        System.out.println(man1.mansBablos());

        System.out.println(man0.hashCode());
        System.out.println(man1.hashCode());
    }
}









        /*Object [] outerObjectsMassive = Arrays.stream(myDudeArray).toArray();
        for (int i = 0; i < outerObjectsMassive.length; i++) {
            System.out.println("----------Element i №" + i + "------------");
            Object[] innerObjectsMassive = Arrays.stream(outerObjectsMassive).toArray();
            for (int j = 0; j < innerObjectsMassive.length; j++) {
                System.out.println("----------Element j №" + j + "------------");
                System.out.println(innerObjectsMassive[j].toString());
            }*/



