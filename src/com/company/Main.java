import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner not = new Scanner(System.in);
        double kdvTutari, girilenTutar, kdvliTutar;
        Scanner tutar = new Scanner(System.in);
        System.out.print("Tutar Giriniz: ");
        girilenTutar = tutar.nextDouble();
        System.out.println("Tutar: " + girilenTutar);1

        if (girilenTutar > 1000) {
            kdvTutari = girilenTutar * 8 / 100;
            kdvliTutar = kdvTutari + girilenTutar;
            System.out.println("KDV Tutarı: " + kdvTutari);
            System.out.println("KDVli Tutar: " + kdvliTutar);
        } else {
            kdvTutari = girilenTutar * 18 / 100;
            kdvliTutar = kdvTutari + girilenTutar;
            System.out.println("KDV Tutarı: " + kdvTutari);
            System.out.println("KDVli Tutar: " + kdvliTutar);

        }
    }
}
