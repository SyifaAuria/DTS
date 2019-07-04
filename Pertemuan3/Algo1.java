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
public class Algo1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukan Angka = ");
        int a=scan.nextInt();
        int x=1;
        int y=x*x;
    
        while(y != a){
                x++;
                y=x*x;
                
        }
    System.out.println("Akar = " + x);
    }
}
