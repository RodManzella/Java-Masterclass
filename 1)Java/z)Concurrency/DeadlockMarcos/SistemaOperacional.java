package SO;
public class SistemaOperacional {
    static final Integer arquivo1 = 1;
    static final Integer arquivo2 = 2;

    public static void main(String[] args) {
        Thread t1 = new Thread( new T1());
        Thread t2 = new Thread( new T2());

        t1.start();
        t2.start();
    }
}
