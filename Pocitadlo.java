public class Pocitadlo {
    public static void main (String[] args) throws InterruptedException {
        VelkePole v = new VelkePole();

        System.out.println(v.secti());

        Thread t = new Vlakno(v);
        Thread t2 = new Vlakno(v);

        t.start();
        t2.start();

        t.join();
        t2.join();
        System.out.println(v.secti());
    }
}
