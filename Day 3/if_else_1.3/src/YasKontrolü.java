import java.util.Scanner;

public class YasKontrolü {

    public static void main(String[]  args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz.");
        int yas = klavye.nextInt();

        if (yas >= 18) {
            System.out.println("Yaşınız 18 den büyük çocuk bileti alamazsınız." + " 150 TL");
        }

        else{
            System.out.println("Yaşınız 18 den küçük çocuk bileti alabilirsiniz." + " 50 TL");
        }


    }



}