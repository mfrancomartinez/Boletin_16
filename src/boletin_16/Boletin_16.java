/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_16;
import boletin_16.newpackage.Persoal;
import Metodos.Metodos;
/**
 *
 * @author Marcos
 */


public class Boletin_16 {
        
    public static void main(String[] args) {
        
        Persoal persoal = new Persoal("637278572", "mfrancomartinez@danielcastelao.org");
        
        Academica alumno = new Academica("Marcos", Metodos.calcularNota(9), persoal);
        
        System.out.println(alumno.toString());
    }
    
}
