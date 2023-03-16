package marathon;


public class PlusOne {
    
    public static void main(String[] args) {
        int array [] = {999};
        int []arrayResposta = plusOne(array);

        for(int i = 0; i < arrayResposta.length; i ++){
            System.out.println(arrayResposta[i]);
        }
           
    }
        
    

    public static int[] plusOne(int[] digits){
        int tam = digits.length;
        int i = tam - 1;
        int [] specialCase;
        
        
        
         if(digits[i] == 9){
            while(digits[i] == 9){ 
                digits[i] = 0;
                i--;       
            }
            digits[i]++;
        }
        else{
            digits[i]++;
        }
        return digits;
    } 
              
}

