/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public abstract class Penumpang {
    protected String nama;
    protected String noTiket;

    public Penumpang(String nama, String noTiket) {
        this.nama = nama;
        this.noTiket = noTiket;
    }

    // Abstract method
    public abstract double hitungHargaTiket();

    // Method biasa
    public void tampilkanData() {
        System.out.println("Nama        : " + nama);
        System.out.println("No Tiket    : " + noTiket);
        System.out.println("Harga Tiket : Rp " + hitungHargaTiket());
    }

    // Overloading method
    public void tampilkanData(String jenis) {
        tampilkanData();
        System.out.println("Jenis       : " + jenis);
    }
}
