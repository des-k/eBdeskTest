/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebdesktest;

import java.io.IOException;

/**
 *
 * @author iman
 */
public class EBdeskTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println(Soal1.printSnipSnap(100));
        int [] array = new int [] {102, 32, 99, 32, 45, 102, 45, 67, 67, 100, 100};
        
        System.out.println(Soal2.getSingleNumber(array));
        
        Soal3.calculateDuplicate();
        
        Soal4.convertKurs();
        
        Soal5.cekPrime();
        
        Soal6.calculateRupiah();
        
        Soal7.createStar();
    }
    
}
