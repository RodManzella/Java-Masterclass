package inheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+ tim.getAge());
        System.out.println("Pay = "+ tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe´s Paycheck = $"+ joe.collectPay());

        joe.retire();
        System.out.println("Joe´s Pension check = $"+joe.collectPay());
        // Notice that now the employee Id for Joe is 2. That´s because employee number, that static field now has the number
        // of the next employee´s employee number.
        // Remember, a static field is a place that lets you share data, among all your instances. When you´re generating an id for a new employee,
        // it´s a place to find the next Id to use.
    }
}
