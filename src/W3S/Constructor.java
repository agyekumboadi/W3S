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
public class Constructor {
    
  int x; 
 
  public Constructor() {
    x = 5; 
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); 
    System.out.println(myObj.x); 
  }
}

