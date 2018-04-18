/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebdesktest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author iman
 */
public class Soal4 {
    
    private static DecimalFormat df2 = new DecimalFormat(".##");
    
    public static void convertKurs(){
        Map<String, Integer> kurs = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("kurs.txt")))
        {
            PrintWriter out = new PrintWriter("hitungKurs.txt");
 
            String sCurrentLine;
            
            while ((sCurrentLine = br.readLine()) != null)
            {
                
                StringTokenizer tk = new StringTokenizer(sCurrentLine, " ");

                String command = tk.nextToken().toLowerCase();
                String kur = tk.nextToken().toLowerCase();
                int number = Integer.parseInt(tk.nextToken());

                if(command.equals("kurs")){
                    kurs.put(kur, number);
                    out.println();
                } else {
                    
                    if (kurs.get(kur)== null){
                        out.println(kur.toUpperCase() + " " + number + " ->unknown");
                    } else {
                        out.println(kur.toUpperCase() + " " + 
                                df2.format(((number * 1.0)/kurs.get(kur))) + " ->" 
                                        +"(" + number+"/"+kurs.get(kur)+")");
                    }
                }
            }
            
            out.close();
            
    
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
