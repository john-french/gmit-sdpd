// John French

public class HourlyEmployee extends Person {
    //  Member Variables
    private double payRate;
    private double hoursWorked;

    //  Member Methods
    public HourlyEmployee() {
        this.payRate = 0;
        this.hoursWorked = 0;
    }

    public HourlyEmployee(String firstName, String lastName, double payRate, double hoursWorked) {
        super(firstName, lastName);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double rate) {
        payRate = rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hours) {
        this.hoursWorked = hours;
    }

    public double calculatePay() {
        return (payRate * hoursWorked);
    }

    public void setNameRateHours(String firstName, String lastName, double payRate, double hoursWorked) {
        setName(firstName, lastName);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String toString() {
        double wages = calculatePay();
        return super.toString() + ", payrate=" + payRate + ", hoursWorked= " + hoursWorked + ", wages= " + wages;
    }
}
