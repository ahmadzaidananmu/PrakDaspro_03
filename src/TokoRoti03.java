import java.util.Scanner;
public class TokoRoti03 {
    public static void main(String[] args) {
        
    Scanner zae =new Scanner (System.in);

    int kotakRoti =27000, modal=1801250, kotakTerjual, pendapatan;
    double bagianPegawai,laba,sisaKas;

    System.out.print("Kotak terjual hari ini: ");
    kotakTerjual = zae.nextInt();
    
    pendapatan = kotakTerjual*kotakRoti;
    laba = pendapatan - modal;
    bagianPegawai = laba / 4;
    sisaKas = laba - bagianPegawai;
    int intKas = (int) sisaKas;
    int intlaba = (int) laba;
    
    System.out.println("Pendapatan : Rp."+pendapatan);
    System.out.println("laba : "+intlaba);
    System.out.println("Tiap pegawai mendapat : Rp."+bagianPegawai);
    System.out.println("Sisa yang masuk kas : Rp."+intKas);
    //cek repo

    zae.close();
    /*Kotak terjual hari ini: 200
    Pendapatan : Rp.5400000
    laba : 3598750
    Tiap pegawai mendapat : Rp.899687.5
    Sisa yang masuk kas : Rp.2699062
    PS C:\Users\ZAID ANMU\.vscode\PrakDasproS1_03>  */
    }
}
