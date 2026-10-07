package Jobsheet4;
import java.util.Scanner;
public class TugasParkir03 {
    public static void main(String[] args) {
        Scanner zae= new Scanner (System.in);
        int lamaParkir, totalTarif;
        System.out.print("Berapa lama anda parkir (jam)   : ");
        lamaParkir = zae.nextInt();

        if (lamaParkir<=2) {
            totalTarif=2000;
        }else {
            totalTarif=2000+((lamaParkir-2)*1000);
        }
        System.out.println("Total tarif parkir anda         :Rp."+totalTarif);
        zae.close();
    }
}
