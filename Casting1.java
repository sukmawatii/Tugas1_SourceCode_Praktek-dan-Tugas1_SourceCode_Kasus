/*NIM   : 13020210025
Nama    : Sukmawati
Hari/Tgl: Jumat, 10 Maret 2023
Waktu   : 20:54 PM*/
package tugas1;

/*Casting menggunakan tipe data primitif*/
public class Casting1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int a=5, b=6;
        float d=2.f, e=3.2f;
        char g='5';
        double k=3.14;

        System.out.println((float)a);   // int <-- float

        System.out.println((double)b);  // int <-- double
        System.out.println((int)d);     // float <-- int
        System.out.println((double)e);  // float <-- double
        System.out.println((int)g);     // char <-- int  (ASCII)
        System.out.println((float)g);   // char <-- float (ASCII)
        System.out.println((double)g);  // char <-- double (ASCII)
        System.out.println((int)k);     // double <-- int
        System.out.println((float)k);   // double <-- float

    }

}
