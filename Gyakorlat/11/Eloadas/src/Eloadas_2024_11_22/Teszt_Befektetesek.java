/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eloadas_2024_11_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Tiba Attila
 */
public class Teszt_Befektetesek {

    public static void main(String[] args) {
        Set<Befektetes> halmaz = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(new File("befektetesek.txt")))) {
            String sor;
            int sor_count = 0;
            while ((sor = br.readLine()) != null) {
                String[] parts = sor.split(",");
                sor_count++;
                try {
                    if (parts.length != 3) {
                        throw new HianyosAdatok("A(z) " + sor_count + ". sor hiányos");
                    }
                    // Az alábbi kód (4 darab sor) nem hajtódik végre, ha HianyosAdatok kivétel
                    // dobódik!
                    double toke = Double.parseDouble(parts[0]);
                    int futamido = Integer.parseInt(parts[1]);
                    double kamat = Double.parseDouble(parts[2]);

                    halmaz.add(new Befektetes(toke, futamido, kamat));

                } catch (HianyosAdatok e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (IOException e) {

        }
        // A halmazt listává alakítjuk (nagyon egyszerű ):
        List<Befektetes> lista = new ArrayList<>(halmaz);
        Collections.sort(lista);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("vegelegsitett_befektetesek.txt")))) {
            for (Befektetes i : lista) {
                bw.write(i.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }
}
