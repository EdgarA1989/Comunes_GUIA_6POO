/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12_guia7;

import entidad.Persona;
import java.util.Scanner;
import servicio.ServicioPersona;

/**
 *
 * @author EANDRADA
 */
public class EJ12_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPersona serviciopersona = new ServicioPersona();
        
        Persona personanueva = serviciopersona.crearPersona();
        serviciopersona.calcularEdad();
        System.out.println("Ingrese una nueva edad");
        serviciopersona.menorQue(leer.nextInt());
        serviciopersona.mostrarPersona();
        
       
    }
    
}
