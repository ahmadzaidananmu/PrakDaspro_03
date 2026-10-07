package Jobsheet2;
public class ContohVariabel03 {

    public static void main(String args[]) {
            String hobi = "Bermain tenis meja"; //SalahSatuHobiSayaAdalah tidak baik karena terlalu panjang dan diawali huruf besar.
            boolean isJago = true;
            char jenisKelamin = 'L';
            byte umur = 18; //_umurSayaSekarang tidak baik karena terlalu panjang dan diawali underscore.
            double ipk = 3.95, tinggi = 1.60; //$ipk tidak baik karena diawali $.

            System.out.println(hobi);    
            System.out.println("Apakah jago ? " + isJago);
            System.out.println("Jenis kelamin ? " + jenisKelamin);
            System.out.println("Umurku saat ini ? " + umur);
            System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }   
}