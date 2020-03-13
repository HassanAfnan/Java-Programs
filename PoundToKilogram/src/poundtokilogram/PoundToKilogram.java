/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poundtokilogram;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PoundToKilogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pounds into Kilograms");
        System.out.println("Enter a number in pounds");
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double kg = p * 0.45359237;
        System.out.println("The number of kilogram is: "+kg);
    }
    
}
