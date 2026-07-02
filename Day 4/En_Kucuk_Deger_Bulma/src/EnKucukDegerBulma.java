public class EnKucukDegerBulma {
    public static void main(String[] args) {

    int [] Fiyatlar = {100, 150, 50, 200, 250};
    int enKucuk = Fiyatlar[0];

    for(int i = 1; i < Fiyatlar.length; i++) {
        if (Fiyatlar[i] < enKucuk) {
            enKucuk = Fiyatlar[i];
        }
    }

    System.out.println("En Küçük Fiyat: " + enKucuk);

    }
}
