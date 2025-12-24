/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Main extends InputPenumpang {

    public static void main(String[] args) {
        Main m = new Main();

        System.out.print("Masukkan Nama Penumpang : ");
        String nama = m.input.nextLine();

        System.out.print("Masukkan No Tiket       : ");
        String noTiket = m.input.nextLine();

        System.out.print("Jenis Penumpang (1 = Reguler, 2 = VIP) : ");
        int pilihan = m.input.nextInt();

        Penumpang penumpang;

        if (pilihan == 1) {
            penumpang = new PenumpangReguler(nama, noTiket);
            penumpang.tampilkanData("Reguler");
        } else {
            penumpang = new PenumpangVIP(nama, noTiket);
            penumpang.tampilkanData("VIP");
        }
    }
}
