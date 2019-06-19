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
public class Vehicle {

  protected String brand = "Ford";        
  public void honk(){                    
    System.out.println("Tuut, tuut!");
  }
}

class car extends Vehicle {
  private String modelName = "Mustang";   
  public static void main(String[] args) {


    car myCar = new car();

    myCar.honk();

   
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
