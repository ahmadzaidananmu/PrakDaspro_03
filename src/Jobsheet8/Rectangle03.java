/*P = 3
Uji soal => Baris = 3
            kolom = 6
Uji tambahan 1 => Baris = 2 + (P mod 3) = 2 
                    kolom = 4 + (P mod 3) = 4
Uji tambahan 2 => Baris =  5 + (P mod 3) = 5
                    kolom = 2 + (P mod 3) = 2

 */
package Jobsheet8;
import java.util.Scanner;
public class Rectangle03 {
    public static void main(String[] args) {
    Scanner zaeInt = new Scanner (System.in);

    int baris=0,kolom=0;

    System.out.print("Masukkan jumlah kolom : ");
    baris=zaeInt.nextInt();
    System.out.print("Masukkan jumlah baris : ");
    kolom=zaeInt.nextInt();

    for (int i = 1; i <= kolom; i++) {
        for (int j = 1; j <= baris; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    zaeInt.close();
    }
}
