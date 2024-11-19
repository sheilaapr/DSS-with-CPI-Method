/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSSwithCPI;

/**
 *
 * @author Sheila
 */
public  class CompositeIndex {
    public static void hitungCompositeIndex(MatriksKeputusan matriksKeputusan) {
        Alternatif[] alternatif = matriksKeputusan.getAlternatif(); //method
        Kriteria[] kriteria = matriksKeputusan.getKriteria();
               
        //proses hitung
        for (Alternatif alt : alternatif) {
            double[] nilaiKriteria = alt.getNilaiKriteria();
            double compositeIndex = 0.0;

            for (int i = 0; i < nilaiKriteria.length; i++) {
                compositeIndex += nilaiKriteria[i] * kriteria[i].getBobot();
            }
            
            //menyimpan hasil
            alt.setCompositeIndex(compositeIndex);
        }
    }
}
