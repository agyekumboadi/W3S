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
public class Static {

  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

 
  public static void main(String[ ] args) {
    myStaticMethod(); 

    MyClass myObj = new Static(); 
    myObj.myPublicMethod(); 
  }
}
