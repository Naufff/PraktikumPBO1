/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author naufa
 */
public class Nilai {
     String NIM;
     String Nama;
     int NilaiAbsen;
     int NilaiTugas;
     int NilaiUTS;
     int NilaiUAS;
     int NilaiAkhir;
     
     float nilai(){
         NilaiAkhir = (NilaiAbsen *10/100) + (NilaiTugas *20/100) + (NilaiUTS * 30/100) + (NilaiUAS *40/100);
         return NilaiAkhir;
     }
     
     void CetakNilai(){
         System.out.println("NIM: " + NIM);
         System.out.println("Nama: " + Nama);
         System.out.println("Niali Absen: " + NilaiAbsen);
         System.out.println("Nilai Tugas: " + NilaiTugas);
         System.out.println("Nilai UTS: " + NilaiUTS);
         System.out.println("Nilai UAS: " + NilaiUAS);
         System.out.println("Nilai Akhir: " + nilai());
     }
}
