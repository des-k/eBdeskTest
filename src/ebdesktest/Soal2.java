/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebdesktest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author iman
 */
public class Soal2 {
    
    public static  SingleNumber getSinglePosition(int [] num)
    {
        List<SingleNumber> list = new ArrayList<>();
        for(int index = 0; index < num.length; ++index){
            
            SingleNumber temp = new SingleNumber(num[index], index);
            boolean duplicate = false;
            for(int indexList = 0; indexList < list.size(); ++indexList){
                if(list.get(indexList).getNumber() == num[index]){
                    list.remove(indexList);
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate)list.add(temp);
        }
        
        if (list.size() == 1) return list.get(0);
        return null;
    }
    
    public static String getSingleNumber(int [] num){
       SingleNumber single = Soal2.getSinglePosition(num);
       if(single != null){
           return "Bilangan yang tidak berpasangan adalah " + single.getNumber() 
                   + " pada posisi "+ (single.getPosition()+1);
       } else {
           return "Tidak ada satu bilangan yang tidak berpasangan";
       }
    }

       
}
