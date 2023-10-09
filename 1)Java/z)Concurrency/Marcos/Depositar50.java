package Thread;

public class Depositar50 implements Runnable{
    
    public Conta conta;

    public Depositar50(Conta conta){
        this.conta = conta;
    }

    @Override
    public void run(){
        conta.depositar(50);
    }
}
