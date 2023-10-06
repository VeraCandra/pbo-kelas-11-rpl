/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package DasarPemprogramanJava;

/**
 *
 * @author LAB1-20
 */
import java.util.Scanner;

public class UTS {
    public static void main(String[] args){
        String nama, kelas;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nama : ");
        nama = scanner.nextLine();
        
        System.out.println("nama :");
       

        System.out.println("kelas :");
        kelas = scanner.nextLine();
        
        System.out.println("kelas :");
        
        float absen;
        System.out.println("absen :");
        absen = scanner.nextFloat();
        
        System.out.println("absen :");
        
        int nilaitugas;
        System.out.println("nilai tugas; ");
        nilaitugas = scanner.nextInt();
        
        int nilaiUAS;
        System.out.println("nilaiUAS; ");
        nilaiUAS = scanner.nextInt();
        
        int nilaiUTS;
        System.out.println("nilaiUTS; ");
        nilaiUTS = scanner.nextInt();
        
        int akhiran;
        
       akhiran = (nilaitugas * 10/100)+(nilaiUTS * 30/100)+(nilaiUAS *60/100);
               System.out.println("nilaI akhir; "+ akhiran);
               
              if (akhiran> 85){
                System.out.println("Nilai A");
                          }
              if (akhiran > 85){
                System.out.println("Nilai B");
                          }
               if (akhiran < 74){
                System.out.println("Nilai C");
                          }
                if (akhiran > 64){
                System.out.println("Nilai D");
                          }
                 if (akhiran < 50){
                System.out.println("Nilai E");
        
       
         
        
        }
    }
}
        

    
