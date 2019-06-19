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

public class AccessMethods{
 public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }


  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String[] args) {
     AccessMethods myCar = new  AccessMethods();   
    myCar.fullThrottle();      
    myCar.speed(200);          
  }
}