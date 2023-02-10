import java.util.Scanner;

public class AsalMi {

    public static boolean asalsayi(int Sayi, int bolen) {
        if (Sayi <= 1) {
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        if (Sayi % bolen == 0) {
            return false;
        }
        return asalsayi(Sayi, bolen - 1);
    }

    public static void main(String[] args) {
        int Sayi = 16;
        int bolen = Sayi / 2;
        if (asalsayi(Sayi, bolen)) {
            System.out.println(Sayi + " ASAL sayıdır .");
        } else {
            System.out.println(Sayi+ " ASAL degildir.");
        }
    }
}

