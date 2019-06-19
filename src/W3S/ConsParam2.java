/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3S;

/**
 *
 * @author agyek
 */
public class ConsParam2 {
  int modelYear;
  String modelName;

  public ConsParam2 (int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    ConsParam2  myCar = new ConsParam2 (1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

