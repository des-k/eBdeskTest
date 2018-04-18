/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebdesktest;

import java.util.Comparator;

/**
 *
 * @author iman
 */
public class SingleNumber {
    private final int position;
    private final int number;
        
    public SingleNumber(int number, int position){
        this.position = position;
        this.number = number;
    }
    
    public int getPosition(){
        return position;
    }
        
    public int getNumber(){
        return number;
    }
    
    
    
}
