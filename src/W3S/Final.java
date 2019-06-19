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
public class Final {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    MyClass myObj = new Final();
    myObj.x = 50; 
    myObj.PI = 25; 
    System.out.println(myObj.x); 
  }
}
