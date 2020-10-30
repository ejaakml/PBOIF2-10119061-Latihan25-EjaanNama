/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author Rheiza
 * NAMA  : Rheiza Akaml R
 * KELAS : IF2   
 * NIM   : 10119061
 */
public class PBOIF210119061Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void ejaan(String nama, int jumlahKarakter){
        for (int i=0; i <jumlahKarakter; i++){
            char eja = nama.charAt(i);
            int no =i+1;
            System.out.println("Huruf ke-" + no + ":" + eja);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        String nama;
        int jumlahKarakter=0;
        
        System.out.print("Masukan nama depan anda untuk di eja : ");
        nama = scanner.nextLine();
        jumlahKarakter = nama.length();
        System.out.println("");
        System.out.println("Ejaan untuk "+ "'" + nama + "'" + "adalah :");
        ejaan(nama,jumlahKarakter);
        System.out.println("Developed by Rheiza Akmal R");
    }
    
}
