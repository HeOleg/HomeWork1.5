public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.printf("Задание 1");
        System.out.println();
        System.out.printf("Вывод не требуется");
        System.out.println();

        int[] oneMassive = new int[]{1, 2, 3};
        double[] twoMassive = {1.57, 7.654, 9.986};
        short[] threeMassive = {7, 5, 6, 2, 4};

        //Задание 2
        System.out.printf("Задание 2");
        System.out.println();

        for (int i = 0; i < oneMassive.length; i++) {
            System.out.print(oneMassive[i]);
            if (i != oneMassive.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < twoMassive.length; i++) {
            System.out.print(twoMassive[i]);
            if (i != twoMassive.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < threeMassive.length; i++) {
            System.out.print(threeMassive[i]);
            if (i != threeMassive.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        //Задание 3
        System.out.printf("Задание 3");
        System.out.println();

        for (int i = oneMassive.length - 1; i >= 0; i--) {
            System.out.print(oneMassive[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = twoMassive.length - 1; i >= 0; i--) {
            System.out.print(twoMassive[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = threeMassive.length - 1; i >= 0; i--) {
            System.out.print(threeMassive[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        //Задание 4
        System.out.printf("Задание 4");
        System.out.println();

        for (int i = 0; i < oneMassive.length; i++) {
            if (oneMassive[i] % 2 ==1) {
                oneMassive[i]++;}
                System.out.print(oneMassive[i]);
                if (i != oneMassive.length - 1) {
                    System.out.print(",");
            }
        }
        }
    }