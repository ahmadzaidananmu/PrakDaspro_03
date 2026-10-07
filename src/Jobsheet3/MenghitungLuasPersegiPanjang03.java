package Jobsheet3;
import java.util.Scanner;
public class MenghitungLuasPersegiPanjang03 {
    public static void main(String[] args) {

        Scanner zae = new Scanner (System.in);
        
        int panjang,lebar,luas;

        System.out.print("Masukkan panjang\t\t: ");
        panjang = zae.nextInt();
        System.out.print("Masukkan lebar\t\t\t: ");
        lebar = zae.nextInt();
        luas = panjang*lebar;
        
        System.out.println("========================================");
        System.out.println("Luas persegi panjang adalah\t: "+luas);

        zae.close(); 
    }
}    