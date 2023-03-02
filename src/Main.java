import java.util.Scanner;

public class Main {

    public static void Task1(){
        int a = 15;
        int b = 4;
        float c = (float) a / b; // оператор приведения типа к float
        double d = (double) a * 1e-3 + c; // оператор приведения типа к double
        System.out.println(d);
    }

    public static void Task2(){
        float f = (float) 128.50;
        int i = (int) f;
        byte b = (byte) (i + (byte) f);
        System.out.println(b);

    }

    public static void Task3(){
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char)nine);

    }
    public static void Task4(){
        double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);

    }
    public static void Task5(){
        long l =  1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = l+ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);

    }
    public static void Task6(){
        int a = 50;
        int b = 17;
        double d = (double) a / b;

        System.out.println(d);

    }
    public static void Task7(){
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b / c / e;
        System.out.println(d);

    }

    public static void Task8(){
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + (float) (b / c) / e;
        System.out.println(d);

    }
    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите задание из списка ниже:");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("""
                    1.Задание 1
                    2.Задание 2
                    3.Задание 3
                    4.Задание 4
                    5.Задание 5
                    6.Задание 6
                    7.Задание 7
                    8.Задание 8
                    Введите 0 чтобы выйти из программы""");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.print("Введите Номер задания: ");
            int n = scanner.nextInt();
            switch (n) {
                case 0 -> f = false;
                case 1 -> Task1();
                case 2 -> Task2();
                case 3 -> Task3();
                case 4 -> Task4();
                case 5 -> Task5();
                case 6 -> Task6();
                case 7 -> Task7();
                case 8 -> Task8();
                default -> System.out.println("Введите указанные номера заданий!");

            }
        }
    }
}
