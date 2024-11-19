/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSSwithCPI;

/**
 *
 * @author Sheila
 */
public class Alternatif {
    //var enkapsulasi
    private String nama;
    private double[] nilaiKriteria;
    private double compositeIndex;
    
    //constructor utk inisialisasi data
    public Alternatif(String nama, double[] nilaiKriteria) {
        this.nama = nama;
        this.nilaiKriteria = nilaiKriteria;
    }
    
    //enkapsulasi
    public String getNama() {
        return nama;
    }

    public double[] getNilaiKriteria() {
        return nilaiKriteria;
    }

    public void setNilaiKriteria(double[] nilaiKriteria) {
        this.nilaiKriteria = nilaiKriteria;
    }

    public void setCompositeIndex(double compositeIndex) {
        this.compositeIndex = compositeIndex;
    }

    public double getCompositeIndex() {
        return compositeIndex;
    }
}
