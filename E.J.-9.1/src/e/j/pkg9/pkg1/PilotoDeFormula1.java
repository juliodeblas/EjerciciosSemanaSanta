/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.j.pkg9.pkg1;

/**
 *
 * @author debla
 */
public class PilotoDeFormula1 {
    
    private String escuderia;
    private String nombre;
    private String apellidos;
    private int numero;
    private double sueldo;
    private String nacimiento;
    private String lugarNacimiento;

    public PilotoDeFormula1() {
    }

    public PilotoDeFormula1(String escuderia, String nombre, String apellidos, int numero, double sueldo, String nacimiento, String lugarNacimiento) {
        this.escuderia = escuderia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
        this.sueldo = sueldo;
        this.nacimiento = nacimiento;
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return "PilotoDeFormula1{" + "escuderia=" + escuderia + ", nombre=" + nombre + ", apellidos=" + apellidos + ", numero=" + numero + ", sueldo=" + sueldo + ", nacimiento=" + nacimiento + ", lugarNacimiento=" + lugarNacimiento + '}';
    }
    
    
    
}
