/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Alonso Medina Reyes
 */
public class Examen {

    private String nombre;
    private String descripcion;
    private String habilidades;
    private Integer experiencia;
    private String nivel;

    public Examen(String nombre, String descripcion, String habilidades, Integer experiencia, String nivel) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.nivel = nivel;
    }
    
    public String Nombre() {
        return nombre;
    }

    public void Nomb(String nombre) {
        this.nombre = nombre;
    }

    public String Descripcion() {
        return descripcion;
    }

    public void Descrip(String descripcion) {
        this.descripcion = descripcion;
    }

    public String Habilidades() {
        return habilidades;
    }

    public void Habilid(String habilidades) {
        this.habilidades = habilidades;
    }

    public Integer Experiencia() {
        return experiencia;
    }

    public void Exper(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public String Nivel() {
        return nivel;
    }

    public void Niv(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Exam{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", habilidades=" + habilidades + ", experiencia=" + experiencia + ", nivel=" + nivel + '}';
    }
    
    public int sueldo(){
        
        int salario = 0;
        if(nivel.equalsIgnoreCase("jr")){
            salario = 1000 * (1 + (experiencia / 10));
        } else if(nivel.equalsIgnoreCase("sr")){
            salario = 1500 * (1 + (experiencia / 10));
        } else if(nivel.equalsIgnoreCase("Leader")){
            salario = 2000 * (1 + (experiencia / 10));
        } else if(nivel.equalsIgnoreCase("boss")){
            salario = 2500 * (1 + (experiencia / 10));
        }
        return salario;
    }

}

