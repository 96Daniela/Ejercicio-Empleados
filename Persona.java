/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela Paladines
 */
public class Persona {

    public String sexo;
    protected double edad;
    public double estatura;
    private double peso;
    protected int numIdentidad;
    public String estado;

    public void respirar() {
        estado = "respirando";
    }

    protected void caminar() {
        estado = "caminando";
    }

    private void alimentar() {
        estado = "alimentando";
    }

    public String investigar() {
        estado = "investigando";
        return estado;
    }

    public String toString() {
        return "Sexo:" + getSexo()
                + "\nEdad:" + getEdad()
                + "\nEstatura:" + getEstatura()
                + "\nPeso:" + getPeso()
                + "\nNúmero Identidad:" + getNumIdentidad()
                + "\nEstado:" + getEstado();
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumIdentidad() {
        return numIdentidad;
    }

    public void setNumIdentidad(int numIdentidad) {
        this.numIdentidad = numIdentidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}

class TestPersonas {

    public static void main(String[] args) {
        Persona personaA = new Persona();
        Persona personaB = new Persona();

        personaA.setEstatura(1.40);
        personaA.setEdad(17.0);
        personaA.setEstado("Soltera");
        personaA.setNumIdentidad(1104120249);
        personaA.setPeso(60.5);
        personaA.setSexo("Femenino");

        System.out.println("Estatura: \t" + personaA.getEstatura());
        System.out.println("Edad: \t" + personaA.getEdad());
        System.out.println("Estado: \t" + personaA.getEstado());
        System.out.println("Número de Identidad: \t" + personaA.getNumIdentidad());
        System.out.println("Sexo: \t" + personaA.getSexo());
        System.out.println(personaA);
        System.out.println(personaB);
    }
}
