public class Vlakno extends Thread{
    VelkePole p;
    int[] arr;
    public Vlakno(VelkePole p){
        this.p = p;
    }

    public void run() {
        for (int i = 0; i < p.delkaPole(); i++) {
            p.prictiJedna(i);

        }
    }

    public void prictiJedna(int index) {
        int x = arr[index];
        int y = x + 1;
        arr[index] = y;
    }

    public long secti() {
        long out = 0;
        for (int i : arr) {
            out += i;
        }
        return out;

    }
}
