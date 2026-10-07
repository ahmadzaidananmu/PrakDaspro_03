package Jobsheet2;
import java.util.Scanner;
public class LuasTanah03 {
    public static void main(String[] args) {
        
        Scanner zae = new Scanner(System.in);

        int Panjang, Lebar, Sisi, LTanah, LTaman;
        double Pi = 3.14, Diameter, LKolam, LT_tidakTerpakai;

        System.out.print("Masukkkan panjang tanah\t\t: ");
        Panjang = zae.nextInt();
        System.out.print("Masukkan lebar tanah\t\t: ");
        Lebar = zae.nextInt();
        System.out.print("Masukkan diameter kolam\t\t: ");
        Diameter = zae.nextInt();
        System.out.print("Masukkan sisi taman\t\t: ");
        Sisi = zae.nextInt();

        LTanah = Panjang*Lebar;
        LKolam = Pi*(Diameter/2)*(Diameter/2);
        LTaman = Sisi*Sisi;
        LT_tidakTerpakai = LTanah-LKolam-LTaman;

        System.out.println("===============================================");
        System.out.println("Luas tanah adalah\t\t: "+LTanah+" meter");
        System.out.println("Luas kolam adalah\t\t: "+LKolam+" meter");
        System.out.println("Luas taman adalah\t\t: "+LTaman+" meter");
        System.out.println("Luas tanah tidak terpakai\t: "+LT_tidakTerpakai+"meter");

        zae.close();
    } 
}       