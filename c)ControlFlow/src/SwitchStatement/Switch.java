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
            
            
        }
    }
    
}
