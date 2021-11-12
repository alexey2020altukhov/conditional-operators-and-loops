public class Main {

    public static void main(String[] args) {
        byte val1 = 121;
        short val2 = 29999;
        int val3 = 1568900431;
        long val4 = 845098758989878941L;
        float val5 = 351.049039015F;
        double val6 = 5.0930985019284898498014832;
        boolean val7 = false;
        char val8 = '#';
        String val9 = "End";

        double result1 = calculateExpression(1, 2, 3, 4);
        System.out.println(result1);

        boolean result2 = determineSumRange(5, 7);
        System.out.println(result2);

        determineSignNumber(-3);

        boolean result3 = checkNumberNegativity(0);
        System.out.println(result3);

        greetUser("Алексей");

        determineWhetherLeapYear(2200);
    }

    public static double calculateExpression(double a, double b, double c, double d) {
        return a*(b+c/d);
    }

    public static boolean determineSumRange(double a, double b) {
        double sum = a+b;
        return sum >= 10 && sum <= 20;
    }

    public static void determineSignNumber(int n) {
        System.out.println(n<0?"Число отрицательное":"Число положительное");
    }

    public static boolean checkNumberNegativity (int n) {
        return n<0;
    }

    public static void greetUser(String userName) {
        System.out.println("Привет, " + userName + "!");
    }

    public static void determineWhetherLeapYear(int year) {
        System.out.println(year%4==0 && (year%100!=0 || year%400==0)?"Год високосный":"Год не високосный");
    }
}
