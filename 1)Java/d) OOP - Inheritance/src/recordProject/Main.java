package recordProject;



public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){

            LPAStudent s = new LPAStudent("S92300"+ i,
             switch(i){
                case 1 -> "Mary";
                case 2 -> " Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
             },
              "05/11/1985",
               "Javs Masterclass");

        System.out.println(s);
        // Every object, when passed to System.out.println, will have the toString method implicitly executed, if you´ve created such a 
        // method on your class.
        }
        
        Student pojoStudent = new Student("S923006", "ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);


        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        // There is no way to set the class list, other than by passing the value in on the record header, or through the use of constructors.
        // This is because a record´s goal is to be immutable.


        System.out.println(pojoStudent.getName() + " is taking "+ pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking "+ recordStudent.classList());  // acessor methods(getters) get accesed differently in records
    }
    



    
}
