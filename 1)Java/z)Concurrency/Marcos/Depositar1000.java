package Thread;

public class Depositar1000 implements Runnable{
    public Conta conta;

    public Depositar1000(Conta conta){
        this.conta = conta;
    }

    @Override
    public void run(){
        conta.depositar(1000);
    }
}
