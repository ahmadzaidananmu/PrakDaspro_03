/*parameter absen 03 ~ 
Tarif1=8000
Tarif2=15000
Tarif3=11000
B=3
S=6*/
import java.util.Scanner;
public class SepedaKampus_03 {
    public static void main(String[] args) {
    Scanner zae = new Scanner (System.in);

    int kode,lama,tarif=0;
    double diskon=0.1,totTarif=0,besarDiskon;
    boolean status;
    String layanan;

    System.out.println("1.Sepeda Biasa\n2.Sepeda Listrik\n3.Sepeda Tandem");
    System.out.print("Masukkan kode : ");
    kode=zae.nextInt();
    System.out.print("Lama sewa (jam): ");
    lama =zae.nextInt();
    System.out.print("Apakah penyewa mahasiswa (true/false) : ");
    status=zae.nextBoolean();

    switch(kode){
        case 1:
            layanan="Sewa sepeda biasa";
        if (lama<=3 && lama>0) {
            tarif=8000*lama;
        }else if (lama>3) {
            tarif=8000 + (4000*(lama-3));
        }
        break;
        case 2:
            layanan="Sewa sepeda listrik";
            if (lama<=3&&lama>0) {
                tarif=15000*lama;
            }else if (lama>3) {
                tarif=15000 + (7500*(lama-3));
            }
            break;
        case 3:
            layanan="Sewa sepeda tandem";
                if (lama<=3&&lama>0) {
                tarif=11000*lama;
            }else if (lama>3) {
                tarif=11000 + (5500*(lama-3));
            }
                break;
        default:
                layanan="Kode tidak dikenal";
                break;
            }
        if (status&&lama>=6) {
            besarDiskon=tarif*diskon;
            totTarif=tarif-diskon;//besarDiskon
        }  
        if (lama>12) {
            layanan="tidak valid";
            tarif=0;
            diskon=0;
            totTarif=0;
        }

        System.out.println("Layanan: "+layanan);
        System.out.println("biaya dasar: "+tarif);
        System.out.println("Diskon"+diskon);//besarDiskon
        System.out.println("Total bayar"+totTarif);

        

    /*1.Sepeda Biasa
2.Sepeda Listrik
3.Sepeda Tandem
Masukkan kode : 2
Lama sewa (jam): 3
Apakah penyewa mahasiswa (true/false) : true
Layanan: Sewa sepeda listrik
biaya dasar: 45000
Diskon0.1 */
    zae.close();
    }
}
