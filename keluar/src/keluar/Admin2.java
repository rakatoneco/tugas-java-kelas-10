/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keluar;

/**
 *
 * @author Dan
 */
public class Admin2 extends Karyawan11 {
    int nomorpegawai;
    public void keterangan(){
        super.officer();
        System.out.println("admin");
    }
    public void setnomorpegawai (int nomorpegawai){
        this.nomorpegawai=nomorpegawai;
    }
    public int getnomorpegawai(){
        return nomorpegawai;
    }
    public void gaji(int pokok,int bonus){
        int total =pokok*bonus;
        System.out.println("Gaji utama yang didapat = "+total);
    }
    public void gaji(int pokok,int bonus, int tambahan){
        int total = pokok*bonus*tambahan;
        System.out.println("Gaji yang didapat jika bekerja dengan baik menjadi "+total);
    }
    @Override
    public void cetak(){
        System.out.print("nomor pegawai = ");
    }
}
