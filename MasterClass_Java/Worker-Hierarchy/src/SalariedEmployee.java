public class SalariedEmployee extends Employee {

    private double anualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double anualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.anualSalary = anualSalary;
        this.isRetired = false;
    }

    public void retired(){
        this.isRetired = true;
        terminate("26-12-2025");
    }

    @Override
    public double collectPay() {
        double payCheck = anualSalary/12;
        return (isRetired) ? payCheck*0.9 : payCheck;
    }

    @Override
    public String toString() {
        return super.toString()+
                " anualSalary=" + anualSalary +
                ", isRetired=" + isRetired;
    }
}
