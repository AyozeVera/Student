/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Main {
    
    public static void main(String[] args) {
       
       Student estudiante = new Student("Manolo", new Date(91,00,16));
       System.out.println(estudiante.getAge());        
       
    }
}

