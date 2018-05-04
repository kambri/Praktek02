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

    public Perkalian() {
        angka1 = 6;
        angka2 = 10;
    }

    public Perkalian(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
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
