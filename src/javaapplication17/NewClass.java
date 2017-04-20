/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Estudiante
 */
public class NewClass {
    public static void main(String[]args)
    {
        File f = new File("xxx.txt");
        PrintStream escritura;
        if(!f.exists()){
            try{
                f.createNewFile();
            }catch(IOException ex) {
                System.out.println("No es posible");                
            }
        }
        
        try {    
            escritura = new PrintStream(f);
            escritura.println("i´m,batman");  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        try {
           Scanner lectura = new Scanner (f);
           lectura.useDelimiter(",");
           while(lectura.hasNext()){
                System.out.println(lectura.next());
            }
           lectura.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        System.out.println(f.exists());
        System.out.println(f.canRead());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
    }
}
