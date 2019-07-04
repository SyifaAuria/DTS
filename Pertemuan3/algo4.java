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
public class algo4 {
     public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukan Angka a = ");
        int a=scan.nextInt();
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Angka b = "); 
        int b=input.nextInt();
        if(a == b ){
        System.out.printf("Bailangan "+a+" sama dengan bilangan "+b);
        }else if(a>b){
        System.out.printf("Bailangan " +a+" lebih besar dari bilangan "+b);
        }else if(b>a){
        System.out.printf("Bailangan " +a+" lebih kecil dari bilangan "+b);
        }
     }
}
