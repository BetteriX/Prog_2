/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2024_11_15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiba Attila
 */
public class Runner {
   public static List<Horse> getFastM(List<Animal> lis, int speed) {
      List<Horse> output = new ArrayList<>();

      for (Animal a : lis) {
         if (a instanceof Horse) {
            Horse h = (Horse) a;
            if (h.getSpeedInMeterPerSec() > speed) {
               output.add(h);
            }

         }

      }
      return output;

   }

   public static void main(String[] args) {
      List<Animal> lis = new ArrayList<>();
      lis.add(new Horse(120, "Csillag", "blue", LocalDate.now(), 10, 180));
      lis.add(new Horse(110, "Szilaj", "blue", LocalDate.now(), 30, 130));
      lis.add(new Horse(100, "Cifra", "blue", LocalDate.now(), 11, 180));
      lis.add(new Ostrich(20, "Sanyi", "SZEP", 4, 40));

      for (Horse h : getFastM(lis, 10)) {
         System.out.println(h);
      }

   }

}
