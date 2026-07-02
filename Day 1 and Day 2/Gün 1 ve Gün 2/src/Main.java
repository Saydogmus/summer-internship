import javax.xml.transform.stream.StreamSource;

public static class Araba {

    String marka;
    String model;
    int uretimYili;
    String renk;
    int maksimumHiz;

    public void arabaOzellikleri() {
        System.out.println(" Arabanin Markasi ve Modeli: " + marka + " " + model);
        System.out.println(" uretimYili " + uretimYili );
        System.out.println(" Arabanın Rengi: " + renk );
        System.out.println(" Arabanın Maksimum Hızı " + maksimumHiz);

    }

    public void testSurusuYap(int turSayisi) {

        for (int i = 1; i <= turSayisi; i++) {
            System.out.println("Tur Sayımız.i " + i);
        }
    }
}

    public void main(String[] args) {
    Araba benimArabam = new Araba();

    benimArabam.marka = "Honda";
    benimArabam.model = "ZRV";
    benimArabam.uretimYili = 2024 ;
    benimArabam.renk = "Beyaz";
    benimArabam.maksimumHiz = 220 ;

    benimArabam.arabaOzellikleri();

    System.out.println("-----");

    benimArabam.testSurusuYap(7);

    }

