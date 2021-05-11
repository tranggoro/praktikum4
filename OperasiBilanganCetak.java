/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapertama.praktikumPBO4;

/**
 *
 * @author Iswanto
 */
class OperasiBilanganCetak extends OperasiBilangan{
    public static void main (String[] args){
        
    
        OperasiBilanganCetak operasi = new OperasiBilanganCetak();
        operasi.setA(10.5);
        operasi.setB(0.5);
        operasi.setC();
    
        System.out.println("Aplikasi Aritmatika");
        System.out.println("Bilangan A: "+operasi.getA());
        System.out.println("Bilangan B: "+operasi.getB());
        operasi.tampil();
    
        OperasiPenjumlahan tambah = new OperasiPenjumlahan();
        tambah.setA(10.5);
        tambah.setB(0.5);
        tambah.setC();
    
        System.out.println(" ");
        System.out.println("Penjumlahan");
        System.out.println("Bilangan A: "+operasi.getA());
        System.out.println("Bilangan B: "+operasi.getB());
        System.out.println("A+B: "+tambah.getC());
        tambah.tampil();
    
        OperasiPengurangan kurang = new OperasiPengurangan();
        kurang.setA(10.5);
        kurang.setB(0.5);
        kurang.setC();
    
        System.out.println(" ");
        System.out.println("Pengurangan");
        System.out.println("Bilangan A: "+operasi.getA());
        System.out.println("Bilangan B: "+operasi.getB());
        System.out.println("A-B: "+kurang.getC());
        kurang.tampil();
    
        Operasiperkalian kali = new Operasiperkalian();
        kali.setA(10.5);
        kali.setB(0.5);
        kali.setC();
    
        System.out.println(" ");
        System.out.println("Perkalian");
        System.out.println("Bilangan A: "+operasi.getA());
        System.out.println("Bilangan B: "+operasi.getB());
        System.out.println("AxB: "+kali.getC());
        kali.tampil();
    
        OperasiPembagian bagi = new OperasiPembagian();
        bagi.setA(10.5);
        bagi.setB(0.5);
        bagi.setC();
    
        System.out.println(" ");
        System.out.println("Pembagian");
        System.out.println("Bilangan A: "+operasi.getA());
        System.out.println("Bilangan B: "+operasi.getB());
        System.out.println("A:B: "+bagi.getC());
        bagi.tampil();
    
    }
    
}
