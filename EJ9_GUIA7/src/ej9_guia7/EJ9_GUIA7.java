/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9_guia7;

import entidad.Matematica;
import java.util.Scanner;
import servicio.servicioMatematica;

/**
 *
 * @author EANDRADA
 */
public class EJ9_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        servicioMatematica serviciomatematica = new servicioMatematica();
        Matematica matematica = new Matematica();
        matematica.setNumero1((double) Math.random() * 9);
        matematica.setNumero2((double) Math.random() * 9);

        while (opcion != 4) {
            opcion = serviciomatematica.menuMatematica(opcion);
            switch (opcion) {
                case 1:
                    serviciomatematica.devolverMayor(matematica);
                    break;
                case 2:
                    serviciomatematica.calcularPotencia(matematica);
                    break;
                case 3:
                    serviciomatematica.calcularRaiz(matematica);
                    break;
            }
        }
    }

}
