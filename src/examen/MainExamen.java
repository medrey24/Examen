/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author acs
 */
public class MainExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Examen probExam = new Examen("developper", "desarrollo de aplicaciones", "base de datos", 3, "Sr");
        System.out.println(probExam.sueldo());
        System.out.println("");
        System.out.println(probExam.toString());
        
      
    }
    
}
