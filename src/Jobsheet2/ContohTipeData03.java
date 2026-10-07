package Jobsheet2;

public class ContohTipeData03 {
    public static void main(String[] args) {
        char golonganDarah = 'O'; //char tipe data utk 1 digit
        byte jarak = (byte) 130; //(byte) nge looping antara -128 ke 127
        short jumlahPendudukDalamSatuDusun = 6767;
        float suhu = 60.50F; //perlu F/f agar dipelakukan sebagai float, krn compiler nganggep desimal sebagai double
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10; //0x menunjukkan heksadesimal (basis 16),puluhan ny x16,satuan normal

        System.out.println("Golongan darah\t\t\t\t: " + (byte) golonganDarah); //unicode or ASCII karena di cast ke (byte) (O jadi 79)
        System.out.println("jarak\t\t\t\t\t: " + jarak); //karena 130>127 jadi 3 lebih nya di ulang dari -128 (hasilny -126)
        System.out.println("Jumlah penduduk dalam satu dusun\t: " + jumlahPendudukDalamSatuDusun); //\t utk menyesuaikan spasi (kelipatan2 )
        System.out.println("Suhu\t\t\t\t\t: " + suhu);
        System.out.println("Berat\t\t\t\t\t: " + (float) berat); //krn cast jd float akurat ny berkurang(pembulatan)
        System.out.println("Saldo\t\t\t\t\t: " + saldo);
        System.out.println("Angka desimal\t\t\t\t: " + angkaDesimal);
    }
}
