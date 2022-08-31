/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.ArregloA;
import java.util.Arrays;

/**
 *
 * @author EANDRADA
 */
public class servicioArreglo {

    ArregloA vector1 = new ArregloA();

    public void rellenarVectorA() {
        double[] aux = new double[50];
        for (int i = 0; i < 50; i++) {
            aux[i] = Math.random() * 9 + 1;
            vector1.setArregloA(aux);
            System.out.println(aux[i] + " ");
        }
        
    }

    public void ordenarVectorA() {
        double[] aux = vector1.getArregloA();
        Arrays.sort(aux);
        vector1.setArregloA(aux);
    }

    public void rellenarVectorB() {
        double[] aux = vector1.getArregloB();
        double[] aux2 = vector1.getArregloA();
        for (int i = 0; i < 10; i++) {
            aux[i] = aux2[i];
        }
        Arrays.fill(aux, 10, 20, 0.5);
        vector1.setArregloB(aux);
    }

    public void mostrarVectores() {
        System.out.println(Arrays.toString(vector1.getArregloA()));
        System.out.println(Arrays.toString(vector1.getArregloB()));
       
    }
}
