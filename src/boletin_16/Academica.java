/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_16;

import java.util.Scanner;
import boletin_16.newpackage.Persoal;
/**
 *
 * @author Marcos
 */
public class Academica {
    
    Scanner sc = new Scanner(System.in);
    private final String numReferencia = "2018";
    private String nome;
    private float nota;
    private Persoal alumno;
    
    public Academica(String nome,float nota, Persoal alumno) {
        this.nome = nome;
        this.nota = nota;
        this.alumno = alumno;
    }
    
    public String getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }
    
    @Override public String toString() {
        return "Academica { " + "nRef: " + numReferencia + ", Nome: " + nome + ", Nota: " + nota + ", Alumno: " + alumno.toString() + " }";
    }
    
    
}

