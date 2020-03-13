/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureclass;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TemperatureClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bol = true;
        while(bol){
        System.out.println("Choose an option\n1- Celcius to Fahrenheit\n2- Fahrenheit to Celcius\n3- Exit ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Temperature t = new Temperature();
        switch(a)
        {
            case 1:
                System.out.println("Enter the temperature in celcius:");
                double s = sc.nextDouble();
                System.out.println("Temperature in fahrenheit: "+t.cTf(s));
                break;
                
            case 2:
                System.out.println("Enter the temperature in fahrenheit:");
                double y = sc.nextDouble();
                System.out.println("Temperature in celcius: "+t.fTc(y));
                break;
       
                
            default:
                bol = false;
                break;
        }
        }
    }
}
    
