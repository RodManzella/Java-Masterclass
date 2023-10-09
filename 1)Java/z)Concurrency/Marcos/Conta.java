package Thread;

public class Conta {
    public double saldo; // recurso compartilhado
    public boolean busy; // variavel para tentar criar EXCLUSAO MUTUA

    synchronized public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
}