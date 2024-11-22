/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eloadas_2024_11_22;

import java.util.List;

/**
 *
 * @author Tiba Attila
 */
public class Mese implements Comparable<Mese> {
    private String cím;
    private List<String> szereplok;

    public Mese(String cím, List<String> szereplok) {
        this.cím = cím;
        this.szereplok = szereplok;
    }

    public String getCím() {
        return cím;
    }

    public List<String> getSzereplok() {
        return szereplok;
    }

    @Override
    public String toString() {
        return cím + ": " +this.szereplok.size();
    }
    
    public int szereplok_szama()
    {
      return this.szereplok.size();
    }

    @Override
    public int compareTo(Mese o) {
        
        if(this.szereplok_szama()==o.szereplok_szama())
        {
           return this.cím.compareTo(o.getCím());
        }
        else{
           return (-1)*Integer.compare(this.szereplok_szama(), o.szereplok_szama());
        }
        
    }
    
    
    
}
