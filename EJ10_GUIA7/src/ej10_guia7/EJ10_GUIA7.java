/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10_guia7;

import servicio.servicioArreglo;

/**
 *
 * @author EANDRADA
 */
public class EJ10_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        servicioArreglo servicioarreglo = new servicioArreglo();

        servicioarreglo.rellenarVectorA();
        servicioarreglo.ordenarVectorA();
        servicioarreglo.rellenarVectorB();
        servicioarreglo.mostrarVectores();
    }

}
