/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miletokg;

/**
 *
 * @author User
 */
public class MileToKg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++) {
             double b = 1.609 * i;
             System.out.println(i+" mile = "+b+" kilogram");
        }
    }
    
}
