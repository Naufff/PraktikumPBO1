/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author naufa
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
         Nilai NilaiMahasiswa = new Nilai();
         NilaiMahasiswa.NIM = "2210631170094" ;
         NilaiMahasiswa.Nama = "Naufal Rahman" ;
         NilaiMahasiswa.NilaiAbsen = (int) 87;
         NilaiMahasiswa.NilaiTugas = (int) 89;
         NilaiMahasiswa.NilaiUTS = (int) 91;
         NilaiMahasiswa.NilaiUAS = (int) 93;
         NilaiMahasiswa.CetakNilai();
    }
}
