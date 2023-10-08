package inheritanceChallenge;

public class SalariedEmployee extends Employee {
    
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired)? 0.9 * paycheck : paycheck;
        return(int) adjustedPay;
    }

    public void retire(){
        terminate("12/12/2025");  
        // Do you remember which class´s method that is? It´s on Worker, the grandparent of this class.
        // or the base class (after Object). As long as the parent class(Employee) doesn´t override it´s parent´s methods(Worker), then
        // these methods can be called from any descendants. Next, we set the isRetired field to true.
        isRetired = true;
    }

    
    
}
