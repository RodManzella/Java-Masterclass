package allABoutStrings;

public class StringMethods {

    public static void main(String[] args) {
        
        String birthdate = "25/11/1982";
        int startingIndex = birthdate.indexOf("1982");
        System.out.println("startingIndex = "+ startingIndex);
        System.out.println("Birth year =  "+birthdate.substring(startingIndex));

        System.out.println("Month = "+ birthdate.substring(3, 5));

        String newDate = String.join("/", "25" , "11", "1982");
        System.out.println("newDate = "+newDate);
    }
}
