public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {

        System.out.println("\nЗадача_1 & 2\n");
        byte[] a = new byte[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        double[] b = {1.57, 7.654, 9.986};
        System.out.println("\n" + b[0] + "," + b[1] + "," + b[2]);

        int[] massive = {32, 53, 35, 23, 132, 123, 4342, 5454};
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + ",");
        }
        System.out.println();
    }

    public static void task2() {

        System.out.println("\nЗадача_3\n");
        byte[] a = new byte[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 2; i >= 0; i -= 1) {
            System.out.print(a[i] + ",");
        }
        double[] b = {1.57, 7.654, 9.986};
        System.out.println("\n" + b[2] + "," + b[1] + "," + b[0]);

        int[] massive = {32, 53, 35, 23, 132, 123, 4342, 5454};
        for (int i = 7; i >= 0; i -= 1) {
            System.out.print(massive[i] + ",");
        }
        System.out.println();
    }

    public static void task3() {

        System.out.println("\nЗадача_4\n");
        int[] a = new int[3];
        a[0] = 1111111113;
        a[1] = 3;
        a[2] = 355763;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] = a[i] + 1;
                System.out.print(a[i]);
            }
            if (i != a.length - 1) {
                System.out.print(",");
            }
        }
    }


}
