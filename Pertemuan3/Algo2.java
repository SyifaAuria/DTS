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
public class Algo2 {
     public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukan Angka = ");
        int a=scan.nextInt();
        /*kalau mau memasukan variabel harus ada scannner beserta library package sccannernya*/
                
     if(a % 2 == 0 ){
        System.out.print("Hasil Bagi yaitu " +a+ " dan merupakan bilangan ganjil" );
        
     }else{
         System.out.println("Hasil Bagi yaitu " +a+ " dan merupakan bilangan ganjil" );
         }         
    }
}