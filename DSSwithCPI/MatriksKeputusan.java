/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSSwithCPI;

/**
 *
 * @author Sheila
 */
public class MatriksKeputusan { //mengelola dan menyimpan krit alt
    //var enkapsulasi
    //array

    private Alternatif[] alternatif;
    private Kriteria[] kriteria;

    //constructor
    public MatriksKeputusan(Alternatif[] alternatif, Kriteria[] kriteria) {
        this.alternatif = alternatif;
        this.kriteria = kriteria;
    }

    //enkapsulasi
    public Alternatif[] getAlternatif() {
        return alternatif;
    }

    public Kriteria[] getKriteria() {
        return kriteria;
    }
}
