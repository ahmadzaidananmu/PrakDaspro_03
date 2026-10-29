/*N yang di input (P=3) :
N = 5
N = (3 + (P mod 5) = 6
N = (9 + (P mod 5) = 12 */
package Jobsheet8;
import java.util.Scanner;
public class Star03 {
    public static void main(String[] args) {
        Scanner zaeInt = new Scanner (System.in);

        System.out.print("Masukkan nilai N : ");
        int n =zaeInt.nextInt();

        for (int i = 1; i <= n; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        zaeInt.close();
    }
}
