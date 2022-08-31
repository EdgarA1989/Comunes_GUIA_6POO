/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_guia7;

import Entidad.Libro;
import Servicio.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class Ej1_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        LibroServicio comodin = new LibroServicio();
        int opcion =0;
        
        while (opcion!=2){
            
            System.out.println("------------MENU----------------");
            System.out.println("1-Ingresar nuevo Libro");
            System.out.println("2-SALIR");
            opcion = leer.nextInt();
            if (opcion==1){
        Libro articulo1 = comodin.llenar();
        comodin.mostrar(articulo1);
            }
        }
    }
    
}
