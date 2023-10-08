package inheritanceChallenge;

public class Employee extends Worker {
    // You´ll notice this time, we don´t get a compiler error, like we did previous video.
    // This was because we created the default constructor for Worker, so Java can create a default constructor for Employee with its own
    // implied call to the empty constructor.

    // Let´s not pass employeeId on the constructor. Let´s generate it. We can do this by setting a static field called employee number
    // on Employee.

    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;
    

    public Employee(String name, String birthDate,  String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo ++;
        // Using the class name when using a static field helps people reading this code understand what´s ocurring.
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + "]" + super.toString();
    }

    

    
}
