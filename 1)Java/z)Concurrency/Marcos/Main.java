package Thread;

public class Main {
    public static void main(String[] args) {
        
        int contador = 0;
        while(true){

        Conta conta = new Conta();

        Thread depositar50 = new Thread (new Depositar50(conta) );
        Thread depositar1000 = new Thread (new Depositar1000(conta));

        depositar50.start();
        depositar1000.start();

        try {
            depositar50.join();
        } catch (InterruptedException e) {
        }

        try {
            depositar1000.join();
        } catch (InterruptedException e) {
        }

        System.out.println("Saldo: "+conta.saldo+" "+contador);
        contador++;

        if(conta.saldo != 1050){
            break;
        }
    }
    }
}
