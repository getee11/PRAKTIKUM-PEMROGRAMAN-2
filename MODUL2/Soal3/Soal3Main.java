package MODUL2.Soal3;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        // Perbaikan: Teks "Nama Pegawai: " diubah menjadi "Nama: " agar sesuai output.
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        
        // Perbaikan: Menambahkan " tahun" agar output sesuai dengan yang diminta ("17 tahun").
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
