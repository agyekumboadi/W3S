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

public class MultipleObjects {
  int x = 5;

  public static void main(String[] args) {
    MultipleObjects myObj1 = new MultipleObjects();  // Object 1
    MultipleObjects myObj2 = new MultipleObjects();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}