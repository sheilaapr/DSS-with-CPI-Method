/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSSwithCPI;

/**
 *
 * @author Sheila
 */
public class NilaiNormalisasi {
    public static void normalisasiNilai(MatriksKeputusan matriksKeputusan) {
        Alternatif[] alternatif = matriksKeputusan.getAlternatif();
        Kriteria[] kriteria = matriksKeputusan.getKriteria();
        int n = kriteria.length;

        // looping kriteria
        for (int j = 0; j < n; j++) {
            double min = Double.MAX_VALUE;

            // mencari nilai min untuk kriteria ke-j
            for (Alternatif a : alternatif) {
                double nilai = a.getNilaiKriteria()[j];
                if (nilai < min) min = nilai;
            }

            // Nmenormalisasikan nilai kriteria ke-j
            for (Alternatif a : alternatif) {
                double[] nilaiKriteria = a.getNilaiKriteria();
                double nilai = nilaiKriteria[j];
                
                //tend positif (benefit))
                if (kriteria[j].isBenefit()) {
                    nilaiKriteria[j] = nilai * 100 / min;
                    
                //trend negatif (cost)
                } else {
                    nilaiKriteria[j] = min * 100 / nilai;
                }
                a.setNilaiKriteria(nilaiKriteria); // update nilai normalisasi
            }
        }
    }
}
