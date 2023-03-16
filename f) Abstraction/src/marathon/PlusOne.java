package marathon;


public class PlusOne {
    
    public static void main(String[] args) {
        int array [] = {1, 2 , 3 , 4};
        plusOne(array);
        
                
    }
        
    

    public static int[] plusOne(int[] digits){
        int tam = digits.length;
        int i = tam - 1;

        if(digits[i] == 9){
            while(array[i] == 9){
                array[i] = 0;
                i--;         
            }
        }else{
            digits[i]++;
        }

        return digits;
    } 
              
}

