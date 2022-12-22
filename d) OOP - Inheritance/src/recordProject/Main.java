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
    }
    
}
