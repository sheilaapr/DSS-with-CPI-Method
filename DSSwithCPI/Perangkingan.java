/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSSwithCPI;

/**
 *
 * @author Sheila
 */
public class Perangkingan {
    public static void cetakHasil(Alternatif[] alternatif) { //method
        
        // Implementasi bubble sort secara menurun
        for (int i = 0; i < alternatif.length - 1; i++) {
            for (int j = 0; j < alternatif.length - i - 1; j++) {
                
                // membandingkan dua elemen berurutan
                if (alternatif[j].getCompositeIndex() < alternatif[j + 1].getCompositeIndex()) {
                    
                    // Tukar posisi jika kondisi terpenuhi
                    Alternatif temp = alternatif[j];
                    alternatif[j] = alternatif[j + 1];
                    alternatif[j + 1] = temp;
                }
            }
        }
        System.out.println("   PENENTUAN PENERIMA BEASISWA\n   \t(by CPI Method)\n\n");
        
        int rank=1;
        for (Alternatif a : alternatif) {
            System.out.println ("========== Peringkat ke-"+rank+ " ===========\nNama\t\t: " + a.getNama() 
            + "\nComposite Index : " + a.getCompositeIndex() + "\n\n");
            rank++;
        }
    }
}
