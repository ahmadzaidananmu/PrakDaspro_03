package Jobsheet7;
import java.util.Scanner;
public class Tugas2_03 {
    public static void main(String[] args) {
    Scanner zaeInt = new Scanner (System.in);

    int jenis,durasi,total=0;
    
    do{
    System.out.println("Jenis kendaraan : \n1 = mobil\n2 = motor\n0 = keluar");
    System.out.print("Masukkan jenis kendaraan : "); 
    jenis=zaeInt.nextInt();

    if (jenis==1||jenis==2) {
        System.out.print("Masukkan durasi : ");
        durasi=zaeInt.nextInt();
        if (jenis==1) {
            total+=durasi*3250;
        }else{
            total+=durasi*2250;
        }
    }
    }while (jenis!=0);
    System.out.println("Total pembayaran : Rp."+total);
    
    zaeInt.close();
    }
}
