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
//Доделать
    public static void Task5(){
        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = 110_987_654_6299.123_34;
        float f = l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);

    }
    public static void Task6(){
        int a = 50;
        int b = 17;
        double d = (float) a / b;

        System.out.println((float) d);

    }
    public static void Task7(){
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + (double) b / c / e;
        System.out.println((int)d);

    }

    public static void Task8(){
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + (float) b / c / e;
        System.out.println((float) d);

    }
    public static void main(String[] args) {
        //Task1();
        //Task2();
        //Task3();
        //Task4();
        //Task5();
        //Task6();
        //Task7();
        Task8();

    }
}