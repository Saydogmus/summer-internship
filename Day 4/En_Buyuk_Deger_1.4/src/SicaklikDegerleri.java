public class SicaklikDegerleri {
    public static void main(String[] args) {

        int[] sicaklikDegerleri = {22, 20, 28, 20, 22, 29};
        int enBuyuk = sicaklikDegerleri[0];
        for (int i = 1; i < sicaklikDegerleri.length; i++) {
                if (sicaklikDegerleri[i] > enBuyuk){
                    enBuyuk = sicaklikDegerleri[i];
                }
        }
        System.out.println("En büyük sıcaklık:" + enBuyuk);

    }
}