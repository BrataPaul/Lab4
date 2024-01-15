public class Employee {

    public String name;

    public String email;

    public static int hourRate;

    public static int capacity;

    public static int freeDays;

    static void calculateDailyIncome() {
       int sum =  hourRate*capacity;
        System.out.println(sum);
    }

    static void calculateMonthlyIncome() {
        int sumLuna = (hourRate*capacity)*(30-freeDays);
        System.out.println(sumLuna);
    }
}


