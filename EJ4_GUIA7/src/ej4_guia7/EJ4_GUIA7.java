/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4_guia7;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EJ4_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioRectangulo var = new ServicioRectangulo();
        Rectangulo rec = var.crear();
        var.perimetro(rec);
        var.superficie(rec);
        var.mostrar(rec);
    }
    
}
