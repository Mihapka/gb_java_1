public class SingleClass {


    byte dayOfWeek = 7;
    short months = 12;
    int salary = 100000;
    long population = 7000000L;

    float coefficient = 1.2F;
    double piUpdate = 3.1415926535897932384626433832795;

    char zero = '\uFF10';

    boolean positiveNumber = true;

    public static void main(String[] args) {

        System.out.println("Сумма чисел " + count(1.2F, 3, 45.6f, 0.7F));
        System.out.println(range(7, 22));
        System.out.println(valueOfNum(-6));
        System.out.println(otherValueOfNum(-6));
        System.out.println(hello("qwerty"));

    }

    public static float count(float a, float b, float c, float d) {
        return (a * (b + (c / d)));

    }

    public static boolean range(int firstNum, int secondNum) {
        if ((firstNum + secondNum) >= 10 && (firstNum + secondNum) <= 20) {
            return true;
        } else return false;
    }

    public static String valueOfNum(int number) {

        if (number >= 0) {
            return "Положительное";
        } else return "Отрицательное";
    }

    public static boolean otherValueOfNum(int number) {

        if (number >= 0) {
            return false;
        } else return true;
    }

    public static String hello(String name) {
        return "Привет, " + name + "!";
    }

    public static int whatYear(int year) {

        return 1;

    }
}
