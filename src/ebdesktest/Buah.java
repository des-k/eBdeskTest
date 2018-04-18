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
public class Buah  {
    private int total;
    private final String name;
        
    public Buah(String  name){
        this.name = name;
        this.total = 1;
    }
    
    public int getBuahTotal(){
        return this.total;
    }
        
    public String getBuahName(){
        return this.name;
    }
    
    public void incrementBuahTotal(){
        this.total += 1;
    }
    
}
