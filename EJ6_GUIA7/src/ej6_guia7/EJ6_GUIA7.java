/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6_guia7;

import entidad.Cafetera;
import entidad.Taza;
import servicio.servicioCafetera;

/**
 *
 * @author EANDRADA
 */
public class EJ6_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        servicioCafetera serviciocafetera = new servicioCafetera();
        Cafetera cafetera = serviciocafetera.llenarCafetera();
        Taza tamañotaza = serviciocafetera.tamañoTaza();
        while (opcion != 5) {
             opcion = serviciocafetera.menuCafetera(opcion);
            switch (opcion) {
                case 1:
                    serviciocafetera.servirTaza(cafetera, tamañotaza);
                    break;
                case 2:
                    serviciocafetera.vaciarCafetera(cafetera);
                    break;
                case 3:
                    serviciocafetera.agregarCafe(cafetera);
                    break;
                case 4:
                    serviciocafetera.mostrarCafetera(cafetera);
                    break;
            }
        }

    }

}
