package praktek02;
public class PerkalianAksi {
    public static void main (String[] args){
        Perkalian n1 = new Perkalian();
        n1.angka1 = 5;
        n1.angka2 = 25;
        
        n1.cetakInfo();
        System.out.println("Jumlah dari hasil perkalian tersebut adalah = "+n1.hasilperkalian());
        n1.cetakhasil();
        
        Perkalian n2 = new Perkalian();
        n2.cetakInfo();
        
        Perkalian n3 = new Perkalian(40,20);
        n3.cetakInfo();
    }    
}
