package pboif2.pkg10119079.latihan38.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class lingkaran {
   Scanner input = new Scanner(System.in);
   String filterAngka;
   double diameter,keliling,luas,jarijari;
   double PHI =3.141;
   boolean kondisi = true;
   
   public double inputDiameter(){
       do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            filterAngka = input.nextLine();
            if(filterAngka.matches("[0-9]*")){
                diameter = Integer.parseInt(filterAngka);
                kondisi = true;
            }else{
                System.out.println("Nilai Diameter Tidak Sesuai!");
                System.out.println("");
                kondisi = false;
            }
        } while (!kondisi);
       return diameter;
   }
   
   public double hitungJariJari() {
       
       jarijari = diameter/2;
       return jarijari;
   }
   
   public double hitungLuas() {
       luas = PHI * hitungJariJari() * hitungJariJari();
       return luas;
   }
   
   public double hitungKeliling() {
     keliling = 2 * PHI * hitungJariJari();   
     return keliling;
   } 
}
