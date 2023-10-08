package forStatement.challenges;

public class SumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(13, 13));
    }
    
    public static int sumOdd(int start, int end){
        int acumulator = 0;

        if(end < start){
            return -1;
        }else if(start < 0){
            return -1;
        }else if(end < 0){
            return -1;
        }

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                acumulator += i;
            }
        }
        return acumulator;
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
