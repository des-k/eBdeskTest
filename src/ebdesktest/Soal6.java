/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebdesktest;

import javax.swing.JOptionPane;

/**
 *
 * @author iman
 */
public class Soal6 {
    public static void calculateRupiah(){
        String input= JOptionPane.showInputDialog("Masukan nilai nominal uang anda: ");
        int money = Integer.parseInt(input);
        System.out.println("Jumlah uang yang anda Masukkan " + "Rp."+ money);
        
        String uang = "Jumlah Uang Rp. ";
        String sebanyak = "     Sebanyak: ";

        System.out.println(uang + "100.000" + sebanyak + money%100000);
        System.out.println(uang + "50.000" + sebanyak + money%50000);
        System.out.println(uang + "20.000" + sebanyak + money%20000);
        System.out.println(uang + "10.000" + sebanyak + money%10000);
        System.out.println(uang + "5.000" + sebanyak + money%5000);
        System.out.println(uang + "2.000" + sebanyak + money%2000);
        System.out.println(uang + "1.000" + sebanyak + money%1000);
        System.out.println(uang + "500" + sebanyak + money%500);
        System.out.println(uang + "100" + sebanyak + money%100);
        System.out.println(uang + "50" + sebanyak + money%50);
        System.out.println(uang + "25" + sebanyak + money%25);
        System.out.println(uang + "5" + sebanyak + money%5);
    }
    
    
}
