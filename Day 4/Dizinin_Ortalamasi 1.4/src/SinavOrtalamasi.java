public  class SinavOrtalamasi {
public static void main(String[] args) {

    int[] notlar = {77, 86, 90, 40, 12, 100};
    int toplam = 0;

    for (int i = 0; i < notlar.length; i++) {
        toplam = toplam + notlar[i];
    }

    double ortalama = (double) toplam / notlar.length;

    System.out.println("Notların toplamı: " + toplam);
    System.out.println("Notların Ortalaması" + ortalama);
}
}


