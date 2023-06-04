package kombinasyonhesapla;

import java.util.Scanner;

public class KombinasyonHesapla {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Kümenin Eleman Sayısını Girin : ");
        int eleman = scanner.nextInt();
        System.out.print("Lütfen Kaçlı Kombinasyonunu İstediğinizi Girin : ");
        int eleman2 = scanner.nextInt();
        
        //C(n,r) = n! / (r! * (n-r)!)   n -> eleman      r -> eleman2
        
        
       double sonuc = Faktoriyel(eleman) / (Faktoriyel(eleman2) * Faktoriyel(eleman-eleman2));        
       System.out.println("C(n,r) = n! / (r! * (n-r)!) : " + sonuc);

    }
    
    
    //Faktoriyel Hesaplayan Metod
    
    public static int Faktoriyel(int x){
        
        if (x == 0 || x == 1) {
            return 1;
        }
        
        int faktoriyel = 1;
        for (int i = 2; i <= x; i++) {
            faktoriyel *= i;
        }
        
        return faktoriyel;
    }
    
    
    
    
}
