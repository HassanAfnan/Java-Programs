/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Maximum of two number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = sc.nextInt();
        System.out.println("Enter second number:");
        int y = sc.nextInt();
        maxNumber(x,y);
    }    

    private static void maxNumber(int a , int b) {
          if(a > b)
          {
              System.out.println(a+" is greater then "+b);
          }
          else
          {
              System.out.println(a+" is less then "+b);
          }
    }
}

