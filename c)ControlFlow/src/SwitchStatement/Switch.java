package SwitchStatement;

public class Switch {
    public static void main(String[] args) {
        
        // int value = 3;

        // if(value == 1){
        //     System.out.println("Value was 1");
        // }else if(value == 2){
        //     System.out.println("Value was 2");
        // }else{
        //     System.out.println("Was not 1 or 2");
        // }


        int switchValue = 1;

        switch(switchValue){  //check the variable switchValue
            case 1:                                              // In the case the variable switchValue is 1, execute the following code.
                System.out.println("Value was 1");
                break;  //the break tells Java that it executed the code for that case, and now wants to leave the switch block.
            case 2:
                System.out.println("Values was 2");
                break;
            case 3: case 4: case 5:  //shorthand                              
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Actually, it was a "+switchValue);
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");  // the switch is good when we want to test different values for the same variable
                break;       
        }
    }

    public static String getQuarter (String month){

        //Notice that this code has the return keyword, before the switch keyword.
        //This switch statement is really and expression, meaning it resolves to a single value and can be assigned to a variable, or
        //in this example, returned from the method

        return switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad";
        };

        // switch(month){
        //     case "JANUARY":
        //     case "FEBRUARY":
        //     case "MARCH":
        //         return "1st";
        //     case "APRIL":
        //     case "MAY":
        //     case "JUNE":
        //         return "2nd";
        //     case "JULY":
        //     case "AUGUST":
        //     case "SEPTEMBER":
        //         return "3rd";
        //     case "OCTOBER":
        //     case "NOVEMBER":
        //     case "DECEMBER":
        //         return "4th";
        // }
        // return "bad";
    }
    
}
