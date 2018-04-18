/*!
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
public class Soal7 {
    
    
    public static void createStar(){
        System.out.print("Enter the number of star (must be odd number) = ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if(number % 2 == 0) {
            System.out.println("You are entering even number!");
        }
        else {
            int star = 1;
            for (star = 1; star <= number; star+=2) {
                String outline = "";
                int middle = (number/2)+1;
                for(int index = 1; index <= number; index++){
                    if(index < middle-(star/2) || index > middle+(star/2)){
                        outline+=" ";
                    }
                    else {
                        outline+="*";
                    }
                }
                System.out.println(outline);
            }
        }
    }
}
