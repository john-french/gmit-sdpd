// TestHourlyEmployee -John French

public class TestHourlyEmployee {

    public static void main(String[] arg) {
        HourlyEmployee employee1 = new HourlyEmployee();
        System.out.println("employee1: " + employee1.toString());
        System.out.println();

        HourlyEmployee emp2 = new HourlyEmployee("Gerry", "Agnew", 10.00, 40);
        System.out.println("emp2: " + emp2.toString());
        System.out.println();

        employee1.setNameRateHours("Mary", "Murphy", 10.0, 40);
        System.out.println("emp1: " + employee1.toString());
        System.out.println();
    }
}
