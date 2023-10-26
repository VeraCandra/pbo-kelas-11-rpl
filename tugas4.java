/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrara;

import java.util.Scanner;

/**
 *
 * @author LAB1-20
 */
public class tugas4 {
    public static void main(String[] args) {
   String nama;
            Scanner input = new Scanner(System.in);
            System.out.println("panggil nama siswa: ");
            nama = input.next();
            switch (nama) {
                case "rara":
                        System.out.println("rara hadir bu");
                        break;
                default:
                    System.out.println("bolos bu");
            }
            
    }
}

    
