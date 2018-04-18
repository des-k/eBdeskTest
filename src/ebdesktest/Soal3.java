/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebdesktest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author iman
 */
public class Soal3 {
    
    public static void calculateDuplicate() throws FileNotFoundException, IOException {

        List<Buah> buahList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("buah.txt")))
        {
            PrintWriter out = new PrintWriter("hitungbuah.txt");
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                String buah = sCurrentLine.toLowerCase();
                boolean newbuah = true;
                for(int indexList = 0; indexList < buahList.size(); ++indexList){
                    if(buahList.get(indexList).getBuahName().equals(buah)){
                        buahList.get(indexList).incrementBuahTotal();
                        newbuah = false;
                    }
                }
                if(newbuah)buahList.add(new Buah(buah));
            }
            Collections.sort(buahList, new Comparator<Buah>() {
                @Override
                public int compare(Buah a, Buah b) {
                    return a.getBuahTotal() > b.getBuahTotal() ? -1 : 
                            (a.getBuahTotal() < b.getBuahTotal()) ? 1 : 0;
                }
            });
            for(int indexList = 0; indexList < buahList.size(); ++indexList){
                if(buahList.get(indexList).getBuahTotal() != 1) {
                    out.println(buahList.get(indexList).getBuahName()+ " "+ 
                            buahList.get(indexList).getBuahTotal());
                }
            }
            out.close();
        }
        catch (IOException e){System.out.println(e.getMessage());}
    }
    
    
}
