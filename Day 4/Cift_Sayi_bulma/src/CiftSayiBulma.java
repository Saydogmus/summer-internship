public class CiftSayiBulma {
    public static void main(String[] args){

        int[] Yaslar = {12, 19, 10, 29, 17, 21, 30, 8};
        int ciftSayaci = 0;

        for(int i = 0; i < Yaslar.length; i++) {
            if (Yaslar[i] % 2 == 0) {

                ciftSayaci++;
            }
        }
System.out.println("Dizideki toplam çift yaş sayısı:" + ciftSayaci);


    }
}