import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee( "Tim", "11/11/1985", "11/12/2022", "01/01/2020");

<<<<<<< HEAD
        Employee joe = new Employee("Joe", "02/05/1899", "11/03/1998", "02/12/2019");
=======
        SalariedEmployee joe = new SalariedEmployee("Joe", "11/03/1998", "02/12/2099","02/12/2019", true, 5000);
>>>>>>> 792b26d (implemented SalariedEmployee)

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        System.out.println("_ _ _ _ _");

        System.out.println(joe);
<<<<<<< HEAD
        System.out.println("Joe's paycheck =", ));

=======
        System.out.println("Joe's paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.adjustedPay());
>>>>>>> 792b26d (implemented SalariedEmployee)
    }
}
