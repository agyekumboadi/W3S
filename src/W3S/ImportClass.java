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
import java.util.Scanner;

public class ImportClass {
    
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine(); 
    System.out.println("Username is: " + userName); 
  }
}

