public class HourlyEmployee extends Employee{

    private double hourlyPayRate;


    public HourlyEmployee(String name, String birthDate, String endDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(){
 
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
