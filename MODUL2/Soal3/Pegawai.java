package MODUL2.Soal3;

//Error: Nama class adalah 'Employee', seharusnya 'Pegawai' agar sesuai dengan yang dipanggil di Soal3Main.java
//public class Employee {
public class Pegawai {

 public String nama;
 
 // Error: Tipe data 'char' hanya bisa menampung satu karakter, tidak bisa untuk "Kingdom of Orvel". Tipe data diubah menjadi String.
 // public char asal;
 public String asal;

 public String jabatan;

 // Inisialisasi nilai umur menjadi 17 agar sesuai dengan output yang diminta.
 // public int umur;
 public int umur = 17;

 public String getNama() {
     return nama;
 }
 
 // Tidak ada error di sini setelah tipe data 'asal' diperbaiki menjadi String.
 public String getAsal() {
     return asal;
 }
 
 // Error: Method setJabatan tidak memiliki parameter untuk menerima input jabatan dan variabel 'j' tidak terdefinisi.
 // public void setJabatan() {
 //     this.jabatan = j;
 // }
 public void setJabatan(String j) {
     this.jabatan = j;
 }
}