/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author Estudiante
 */
public class Test2 {
    public Test2()
  {
      divideByZero();
  }
  
    double divideByZero()
    {
        double result = 0;
        try
        {
            result = 25/0;
        }catch(ArithmeticException exception){
            System.out.println("No es posible dividir por cero");
        }
        return result;                   
    }
    
}
