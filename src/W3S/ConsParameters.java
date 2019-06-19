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
public class ConsParameters{
  int x;

  public ConsParameters(int y) {
    x = y;
  }

  public static void main(String[] args) {
    ConsParameters myObj = new ConsParameters(5);
    System.out.println(myObj.x);
  }
}  
