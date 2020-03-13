/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeven;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class OddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean c = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Odd or Even");
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        if(a % 2 == 0)
        {
            System.out.println("Is "+a+" an even number?");
            c = true;
            System.out.println(""+c);
        }
        else
        {
            System.out.println("Is "+a+" an odd number");
            System.out.println(""+c);
        }
    }
    
}
