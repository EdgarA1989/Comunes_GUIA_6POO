/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cafetera;
import entidad.Taza;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class servicioCafetera {

    public Cafetera llenarCafetera() {
        Cafetera capacidadcafetera = new Cafetera();
        capacidadcafetera.setCantidadActual(capacidadcafetera.getCapacidadMaxima());
        return capacidadcafetera;
    }

    public Taza tamañoTaza() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la Taza");
        Taza tamañotaza = new Taza();
        tamañotaza.setTamañotaza(leer.nextInt());
        return tamañotaza;
    }

    public void servirTaza(Cafetera cafetera, Taza tamañotaza) {
        if (tamañotaza.getTamañotaza() < cafetera.getCantidadActual()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamañotaza.getTamañotaza());
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cafe a agregar");
        int nuevocafe = leer.nextInt();
        if (cafetera.getCantidadActual() + nuevocafe <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + nuevocafe);
        } else {
            System.out.println("La cantidad ingresada sobrepasa el maximo de capacidad de la cafetera");
        }
    }
    public void mostrarCafetera(Cafetera cafetera){
        cafetera.getCantidadActual();
        cafetera.getCapacidadMaxima();
        System.out.println(cafetera.toString());
                
    }
    public int menuCafetera(int opcion){
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------MENU----------------");
        System.out.println("1-LLenar taza");
        System.out.println("2-Vaciar cafetera");
        System.out.println("3-Agregar cafetera");
        System.out.println("4-Mostrar estado de cafetera");
        System.out.println("5-Salir");
        opcion= leer.nextInt();
        return opcion;
    }
}
