import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        double boy, kilo, vucutKitleIndeksi;


        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();
        inp.close();


        vucutKitleIndeksi = kilo / (boy * boy);


        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);
    }
}
