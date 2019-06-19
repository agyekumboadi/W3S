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
public class FinalOveride {
  final int x = 10;

  public static void main(String[] args) {
     MyClass myObj = new FinalOveride();
     myObj.x = 25;
    System.out.println(myObj.x); 
  }
}