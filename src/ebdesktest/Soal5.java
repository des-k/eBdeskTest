/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebdesktest;

import java.util.Scanner;

/**
 *
 * @author iman
 */
public class Soal5 {
 
    public static void cekPrime(){
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        
        String output = number + " is ";
        output += Soal5.isPrime(number)? "" : "not";
        output += " a Prime Number";
        System.out.println(output);
    }
    
    public static boolean isPrime(int number){
        int num = 2;
        if (number <= 1) return false;
        while(num*num <= number) {
            if (number % num == 0) return false;
            num++;
        }
        return true;
    }
    
    
}
