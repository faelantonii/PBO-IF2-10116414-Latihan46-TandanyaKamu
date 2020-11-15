/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan46_TandanyaKamu;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program tandanya kamu
 */
public class PBO_IF2_10116414_TandanyaKamu {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        int tahunLahir = scan.nextInt();
        
        Umur umur = new Umur(2020);
        umur.setTahunLahir(tahunLahir);
        
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + umur.getTahunLahir());
        System.out.println("Hari ini tahun : " + umur.getTahunSekarang());
        System.out.println("Umur kamu sampai hari ini adalah " + umur.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + umur.tandanyaKamu(umur.hitungUmur()));
    }
}
