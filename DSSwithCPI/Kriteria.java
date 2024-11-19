/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSSwithCPI;

/**
 *
 * @author Sheila
 */
public class Kriteria { //class
    //var enkapsulasi
    private String nama;
    private double bobot;
    private boolean isBenefit; //misal true(+):benefit, false(-):cost
    
    //constructor utk inisialisasi data
    public Kriteria(String nama, double bobot, boolean isBenefit) {
        this.nama = nama;
        this.bobot = bobot;
        this.isBenefit = isBenefit;
    }
    
    ///enkapsulasi
    public String getNama() {
        return nama;
    }

    public double getBobot() {
        return bobot;
    }

    public boolean isBenefit() {
        return isBenefit;
    }
}
