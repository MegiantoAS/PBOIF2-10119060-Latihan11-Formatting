/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan11.formatting;

/**
 *
@author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Latihan Logika
 */
public class PBOIF210119060Latihan11Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3546764;
        int iMinus = -i; 
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d :%10d%n ", i);
        System.out.printf("%%+10d : %+10d%n ", i);
        System.out.printf("%%+10d :%+10d%n ", iMinus);
        System.out.printf("%%,10d :%,10d%n ", i);
        System.out.printf("%%-10d :%-10d%n ", i);
        double f = 5675482.982;
        System.out.printf("f" + f);
        System.out.printf("%%f :%f%n ", f);
        System.out.printf("%%.2f : %.2f%n ", f);
        System.out.printf("%%12.2ff :%,12.2f%n ", f);
        System.out.printf("%%,12.2ff :%,12.2f%n ", f);
    }
    
}
