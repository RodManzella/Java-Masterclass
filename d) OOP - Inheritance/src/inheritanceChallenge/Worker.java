package inheritanceChallenge;

public class Worker  {
    
    private String name;
    private String birthDate;
    protected String endDate;
    // the endDate will get set by a method, either on this class, or a subclass. So, making it protected will give subclass the flexibility
    // to operate on it.

    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){

        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.0;
        // This method is one which should be overriden by subclasses, that can figure out the right pay to return, based on the type of worker.
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    

}
