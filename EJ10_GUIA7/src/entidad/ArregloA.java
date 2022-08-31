/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author EANDRADA
 */
public class ArregloA {

    double[] arregloA = new double[50];
    double[] arregloB = new double[20];

    public ArregloA() {
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    @Override
    public String toString() {
        return "ArregloA{" + "arregloA=" + arregloA + ", arregloB=" + arregloB + '}';
    }

}
