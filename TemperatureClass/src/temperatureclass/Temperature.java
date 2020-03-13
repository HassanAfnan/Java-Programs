/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureclass;

/**
 *
 * @author User
 */
public class Temperature {
   public double cTf(double c)
   {
      double f = (c * 1.8)+32;
      return f;
   }
   public double fTc(double f)
   {
      double c = (f - 32)/1.8;
      return c;
   }
}
