/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumeandarea;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class VolumeAndArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi = 3.142;
        Scanner sc = new Scanner(System.in);
        System.out.println("Volume and area of cylinder");
        System.out.println("Enter radius of cylinder:");
        double r = sc.nextDouble();
        System.out.println("Enter length of cylinder");
        double l = sc.nextDouble();
        double A = pi * r * r;
        double V = A * l;
        System.out.println("The area of cylinder is "+A);
        System.out.println("The volume of cylinder is "+V);
        
    }
    
}
