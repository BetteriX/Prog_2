/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eloadas_2024_11_22;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tiba Attila
 */
public class Main {
    public static void main(String[] args) {
        String szereplo = args[0];
        List<Mese> mesek = new ArrayList();
        
        try(Scanner sc = new Scanner(new File("input.txt")))
        {
            while(sc.hasNextLine())
            {
               String sor = sc.nextLine();
               String [] reszek = sor.split(":");
               
               String cim = reszek[0];
               List<String> szereplok= Arrays.asList(reszek[1].split(","));
               
               mesek.add(new Mese(cim,szereplok));
            }
            
            
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        
        
        List<Mese> talalatok = new ArrayList<>();
        
        for(Mese e: mesek)
        {
             if(e.getSzereplok().contains(szereplo))
                 talalatok.add(e);
        }
        
        Collections.sort(talalatok);
        
        for(Mese m: talalatok)
        {
            System.out.println(m);
        }
        
        try (PrintWriter pw = new PrintWriter(new File("ki.txt")))
        {
             for(Mese m: talalatok)
        {
             //System.out.println(m);
            pw.printf("%s\n", m.toString());
        }
          
        }
        catch(IOException e)
        {}
        
        
    }
}
