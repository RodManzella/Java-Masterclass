package marathon;


public class PlusOne {
    
    public static void main(String[] args) {
        int array [] = {1, 2 , 3 , 4};
        plusOne(array);

                
    }
        
    

    public static int[] plusOne(int[] digits){
        int tam = digits.length;

        if(digits[tam - 1] == 9){
            while(array[i] == 9){
                array[i] = 0;
                i--;         
            }
        }else{
            digits[tam - 1]++;
        }

        return digits;
    } 
              
}

