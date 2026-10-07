package TopUp_Diamond;
import java.util.Scanner;
public class TopUp_Diamond {
    public static void main(String[] args) {
        
        Scanner zae = new Scanner (System.in);

        String Nickname;
        int WDP=220, SVP=55, harWDP=29000, harSVP=15000, jumWDP, jumSVP;

        System.out.println("=== ZAE SHOP ===");
        System.out.println("Paket Weekly Diamond Pass\t(220 Diamond)\t: Rp.29.000");
        System.out.println("Paket Super Value Pass\t(55 Diamond)\t: Rp.15.000");     
        
        System.out.println("=== KASIR ZAE SHOP ===");
        System.out.print("Masukkan Nickname\t: ");
        Nickname = zae.nextString();
        System.out.print("Weekly Diamond Pass\t(qty)\t: ");
        jumWDP = zae.nextInt();
        System.out.print("Super Value Pass\t(qty)\t: ");
        jumSVP = zae.nextInt();

        int TotDiam = WDP*jumWDP+SVP*jumSVP;
        int totHar = harWDP*jumWDP+harSVP+jumSVP;

        System.out.println("--- STRUK PEMBELIAN ---");
        System.out.println("Nickname\t: "+Nickname);
        System.out.println("Total Diamond\t: "+TotDiam);
        System.out.println("Total Harga\t: "+totHar);
        System.out.println("======================");

    }   
    
}
