/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebdesktest;

/**
 *
 * @author iman
 */
public class Soal1 {
    
    
    private static boolean kelipatan(int number, int factor){
        return number % factor == 0;
    }
    
    
    
    public static String printSnipSnap(int max){
        String result = "";
        boolean kelipatan3, kelipatan5;
        for(int index= 1; index <= max; index++){
            
            if(kelipatan3 = Soal1.kelipatan(index, 3)) {
                result += "snip";
            }
            
            if(kelipatan5 = Soal1.kelipatan(index, 5)) {
                result += kelipatan3? "-": "";
                result += "snap";
            }
            
            if(index != max) {
                result += kelipatan3 || kelipatan5 ? ",": index+",";
            }
        }
        return result;
    }
}
