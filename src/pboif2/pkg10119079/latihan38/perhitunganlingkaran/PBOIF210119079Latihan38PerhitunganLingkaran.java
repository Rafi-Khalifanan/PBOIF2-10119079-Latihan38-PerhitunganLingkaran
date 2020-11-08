package pboif2.pkg10119079.latihan38.perhitunganlingkaran;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan38PerhitunganLingkaran {
    public static void main(String[] args) {
        lingkaran ling = new lingkaran();
        
        System.out.println("======Perhitungan Lingkaran======");
        ling.inputDiameter();
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + ling.hitungJariJari()+" cm");
        System.out.println("Luas Lingkaran = " + ling.hitungLuas()+" cm");
        System.out.println("Keliling Lingkaran = " + ling.hitungKeliling()+" cm");
    }
    
}
