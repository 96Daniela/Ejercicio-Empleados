/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela Paladines
 */
public class Empleado {

    public String nombre;
    public String apellido;
    public double salario;

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    Empleado() {
    }
    
    public String toString() {
        return ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class PruebaEmpleado{
    public static void main(String[] args) {
        Empleado empleadoA = new Empleado();
        Empleado empleadoB = new Empleado();
        
        empleadoA.setSalario(400);
        empleadoB.setSalario(300);
        
        
        
    }
}
