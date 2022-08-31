/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11_guia7;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EJ11_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia;
        int mes;
        int anio;
        System.out.println("Ingrese el día de la fecha");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes de la fecha");
        mes = leer.nextInt();
        System.out.println("Ingrese el año de la fecha");
        anio = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        Date nuevafecha = new Date();
     
        System.out.println("La diferencia entre años es: "+Math.abs(nuevafecha.getYear()-fecha.getYear()));
        System.out.println("La diferencia entre meses es: "+Math.abs(nuevafecha.getMonth()-fecha.getMonth()));
        System.out.println("La diferencia entre dias es: "+Math.abs(nuevafecha.getDate()- fecha.getDate()));
        System.out.println(nuevafecha.toString());
        System.out.println(fecha.toString());

    }
    
}
