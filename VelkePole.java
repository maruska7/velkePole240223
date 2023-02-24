public class VelkePole {

    int[] arr;

    public VelkePole(){
        arr = new int[1000000];
    }

    public int delkaPole() {
        return arr.length;
    }

    public void prictiJedna(int index) {
        arr[index] += 1;
    }

    public int secti() {
        int soucet = 0;
        for (int c : arr) {
            soucet += c;
        }
        return soucet;
    }

}
