/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class algo3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukan Angka = ");
        int r=scan.nextInt();
        double x = 3.14;
        double k,l;
        k=2*x*r;
        l=x*r*r;
        System.out.println("Keliling adalah = " +k );
        System.out.println("Luas adalah = " +l );
    }
                
        
}
