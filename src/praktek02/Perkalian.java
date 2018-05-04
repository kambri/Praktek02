package praktek02;
public class Perkalian {
    double angka1;
    double angka2;
    
    void cetakInfo(){
        System.out.println("==================================");
        System.out.println("Angka Pertama = "+angka1);
        System.out.println("Angka Kedua   = "+angka2);
        System.out.println("==================================");
    }
    
    double hasilperkalian(){
        double hasil;
        hasil = angka1 * angka2;
        return hasil;
    }
    
    void cetakhasil(){
        System.out.println("Jumlah dari hasil perkalian nya = "+hasilperkalian());
    }
}
