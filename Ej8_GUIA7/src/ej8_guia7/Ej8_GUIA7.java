/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8_guia7;

import entidad.Cadena;
import java.util.Scanner;
import servicio.servicioCadena;

/**
 *
 * @author EANDRADA
 */
public class Ej8_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena frase = new Cadena();
        int opcion = 0;
        servicioCadena serviciocadena = new servicioCadena();
        System.out.println("Ingrese una frase");
        frase.setFrase(leer.nextLine());
        frase.setLongitudFrase(frase.getFrase().length());

        while (opcion != 8) {
            opcion= serviciocadena.menuCadena(opcion);
            switch (opcion) {
                case 1:
                    serviciocadena.mostrarVocales(frase);
                    break;
                case 2:
                    serviciocadena.invertirFrase(frase);
                    break;
                case 3:
                    serviciocadena.vecesRepetidor(frase);
                    break;
                case 4:
                    serviciocadena.compararLongitud(frase);
                    break;
                case 5:
                    serviciocadena.unirFrases(frase);
                    break;
                case 6:
                    serviciocadena.remplazar(frase);
                    break;
                case 7:
                    serviciocadena.contiene(frase);
                    break;
            }
        }

    }

}
