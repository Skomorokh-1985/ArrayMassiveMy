public class Test {

    public static void main(String[] args) {

        method1();
        method2();

        method1();
        method2();

        method1();
        method2();

        method1();
        method2();

        method1();
        method2();
    }

    private static void method1() {
        String s = "";
        long begin = System.currentTimeMillis();
        for (int x = 0; x < 100_000; x++) {
            String number = String.valueOf(x);
            s += number;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    private static void method2 () {
        StringBuilder stringBuilder = new StringBuilder();
        long begin2 = System.currentTimeMillis();
        for (int x = 0; x < 100_000; x++) {
            String number = String.valueOf(x);
            stringBuilder.append(number);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - begin2);
    }
}
