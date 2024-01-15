import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner myObj = new Scanner(System.in);

            Employee Obj = new Employee();
            System.out.println("Nume: ");
            Obj.name = myObj.nextLine();

            System.out.println("Email: ");
            Obj.email = myObj.nextLine();

            System.out.println("bani/ora: ");
            Employee.hourRate = Integer.parseInt(myObj.nextLine());

            System.out.println("ore pe zi: ");
            Employee.capacity = Integer.parseInt(myObj.nextLine());

            System.out.println("zile libere: ");
            Employee.freeDays = Integer.parseInt(myObj.nextLine());



        Employee.calculateDailyIncome();

        Employee.calculateMonthlyIncome();


    }
}