package marathon;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int []array = new int[4];
        for(int i = 0; i <= array.length - 1; i ++ ){
            System.out.println("Digite o valor que quer inserir no array");
            array[i] = scan.nextInt();
        }

        for(int numbers : array){
            System.out.println(numbers);
        }
    }
}
