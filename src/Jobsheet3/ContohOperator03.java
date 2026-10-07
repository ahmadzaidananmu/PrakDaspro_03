package Jobsheet3;

public class ContohOperator03 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++\t\t\t: "+ x++); // x++ itu ngeprint dulu nilai x sekarang, lalu nilai ny ditambah
        System.out.println("Setelah evaluasi\t: "+x);

        x = 10;
        System.out.println("++x\t\t\t: "+ ++x); // ++x itu nambah nilai ny dulu, lalu baru di print
        System.out.println("Setelah evaluasi\t: "+x);

        System.out.println("============================");
        int y = 12;
        System.out.println(x>y || y==x && x<=y); // ((false or false) and true) = false
        System.out.println("============================");

        int z = x^y;
        System.out.println("Hasil x ^ y\t\t: "+z);// x=11(1011) xor y=12(1100) : 0111(7) 
        z %= 2;//sisa bagi z oleh 2
        System.out.println("Hasil akhir\t\t: "+z);  
    }
}
