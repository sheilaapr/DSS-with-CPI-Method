/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSSwithCPI;

/**
 *
 * @author Sheila
 */
public class Main {
    public static void main(String[] args) { //komposisi : membuat objek krit dan alt -> matriks keputusan
        Kriteria[] kriteria = {
            new Kriteria("C1", 0.167, true),
            new Kriteria("C2", 0.250, false),
            new Kriteria("C3", 0.458, true),
            new Kriteria("C4", 0.125, false)
        };

        Alternatif[] alternatif = {
            new Alternatif("Firza", new double[] {30, 30, 40, 80}),
            new Alternatif("Dewi", new double[] {20, 40, 30, 60}),
            new Alternatif("M. Nina", new double[] {40, 50, 70, 70}),
            new Alternatif("Tantri A.", new double[] {20, 40, 20, 60}),
            new Alternatif("James", new double[] {40, 30, 30, 80}),
            new Alternatif("K. Alfian", new double[] {20, 50, 30, 80}),
            new Alternatif("Pandu", new double[] {50, 40, 40, 60}),
            new Alternatif("N. Carlie", new double[] {40, 40, 70, 60})
    };
        //polymorphism : memanggil method dari kelas yang berbeda
        MatriksKeputusan matriksKeputusan = new MatriksKeputusan(alternatif, kriteria);

        NilaiNormalisasi.normalisasiNilai(matriksKeputusan);
        CompositeIndex.hitungCompositeIndex(matriksKeputusan);
        Perangkingan.cetakHasil(matriksKeputusan.getAlternatif());
    }
}
