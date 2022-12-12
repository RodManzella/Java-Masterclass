package forStatement.challenges;

public class SumOdd {

    public static void main(String[] args) {
        
    }
    
    public static boolean isOdd(int number){
        boolean isOdd = false;

        if(number < 0 ){
            return isOdd;
        }
        else{
            if(number % 2 != 0){
                isOdd = true;
            }
        }
        return isOdd;
    }
}
