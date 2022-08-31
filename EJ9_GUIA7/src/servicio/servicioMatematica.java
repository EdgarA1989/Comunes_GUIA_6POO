/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class servicioMatematica {

    public void devolverMayor(Matematica matematica) {
        double mayor = Math.max(matematica.getNumero1(), matematica.getNumero2());
        System.out.println("El numero mayor es : " + mayor);

    }

    public void calcularPotencia(Matematica matematica) {
        double potencia;
        double valornumero1 = Math.abs(matematica.getNumero1());
        double valornumero2 = Math.abs(matematica.getNumero2());
        if (valornumero1 > valornumero2) {
            potencia = Math.pow(valornumero1, valornumero2);
            System.out.println("La potencia es: " + potencia);
        } else {
            potencia = Math.pow(valornumero2, valornumero1);
            System.out.println("La potencia es: " + potencia);
        }

    }

    public void calcularRaiz(Matematica matematica) {
        double minimo = Math.min(matematica.getNumero1(), matematica.getNumero2());
        double raiz = Math.sqrt(minimo);
        System.out.println("La raiz cuadrada es " + raiz);
    }

    public int menuMatematica(int opcion) {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------MENU----------------");
        System.out.println("1-Mostrar numero mayor");
        System.out.println("2-Mostrar potencia");
        System.out.println("3-Mostrar raiz del valor minimo");
        System.out.println("4-Salir");
        opcion=leer.nextInt();
        return opcion;
    }
}
