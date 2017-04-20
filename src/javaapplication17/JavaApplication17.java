/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class JavaApplication17 {
 double divideByZero(int denominador)    throws JavierException       
    {   
        double result = 0;
        if (denominador == 0)
            throw new JavierException();
        
        result = 25/denominador;
        return result;                   
    }
    
    public static void main(String[] args)  {
     JavaApplication17 j = new JavaApplication17();
     Scanner tec = new Scanner(System.in);
     int denominador = 0;
     double resultado = 0;
        for (int i = 0; i < 5; i++) {
            denominador = tec.nextInt();
            try{
            resultado = j.divideByZero(denominador);
            System.out.println(resultado);
            }catch(JavierException v){                
            System.out.println("No es posible dividir por cero");
            v.printStackTrace();
            }
            
        }
    }
    
}
