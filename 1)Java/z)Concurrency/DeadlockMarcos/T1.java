package SO;

public class T1 implements Runnable{
    @Override
    public void run(){
        System.out.println("T1 tentar obter arquivo1");
        synchronized(SistemaOperacional.arquivo1){ // regiao critica dentro da thread
            System.out.println("T1 obteve arquivo1");

            System.out.println("T1 tentar obter arquivo2");
            synchronized(SistemaOperacional.arquivo2){
                System.out.println("T1 obteve arquivo2");
            }
        }
    }
}