

public class Main {
    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5,6,7};
        double harmonikSeriToplami = 0.0;
        double harmonikSeriOrtalamasi;

        for (double j : list) {
            harmonikSeriToplami += (1 / j);
        }

        harmonikSeriOrtalamasi = list.length / harmonikSeriToplami;

        System.out.println("HARMONİK SERİ TOPLAMI \t\t: " + harmonikSeriToplami);
        System.out.println("HARMONİK SERİ ORTALAMASI \t: " + harmonikSeriOrtalamasi);

    }
}

