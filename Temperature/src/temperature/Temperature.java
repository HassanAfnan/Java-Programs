/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Celsius to Fahrenheit");
        System.out.println("Enter the temperature in Celsius:");
        Scanner sc = new Scanner(System.in);
        double C = sc.nextDouble();
        double F = ((9 * C)/5)+32;
        System.out.println("The temperature in Fahrenheit: "+F);
    }
    
}
