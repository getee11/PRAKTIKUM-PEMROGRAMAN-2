package MODUL2.Soal1;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlahBeli;

    public Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public void tampilkanInfo() {
        double hargaSebelumDiskon = (this.jumlahBeli / this.berat) * this.harga;
        double kelipatanDiskon = Math.floor(this.jumlahBeli / 4);
        double totalDiskon = kelipatanDiskon * (this.harga * 0.08);
        double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;

        System.out.println("Nama Buah: " + this.nama);
        System.out.println("Berat: " + this.berat);
        System.out.println("Harga: " + this.harga);
        System.out.println("Jumlah Beli: " + this.jumlahBeli + "kg");
        System.out.println("Harga Sebelum Diskon: " + String.format("Rp%.2f", hargaSebelumDiskon));
        System.out.println("Total Diskon: " + String.format("Rp%.2f", totalDiskon));
        System.out.println("Harga Setelah Diskon: " + String.format("Rp%.2f", hargaSetelahDiskon));
        System.out.println();
    }
}
