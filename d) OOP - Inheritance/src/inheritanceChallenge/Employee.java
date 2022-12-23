package inheritanceChallenge;

public class Employee extends Worker {
    // You´ll notice this time, we don´t get a compiler error, like we did previous video.
    // This was because we created the default constructor for Worker, so Java can create a default constructor for Employee with its own
    // implied call to the empty constructor.

    private long employeeId;
    private String hireDate;
    

    public Employee(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + "]" + super.toString();
    }

    

    
}
