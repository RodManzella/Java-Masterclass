package SO;
public class T2 implements Runnable{
    @Override
    public void run(){
        System.out.println("T2 tentar obter arquivo2");
        synchronized(SistemaOperacional.arquivo2){ // regiao critica dentro da thread
            System.out.println("T2 obteve arquivo2");

            System.out.println("T2 tentar obter arquivo1");
            synchronized(SistemaOperacional.arquivo1){
                System.out.println("T2 obteve arquivo1");
            }
        }
    }
}
