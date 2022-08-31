/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class servicioCadena {

    public void mostrarVocales(Cadena cadena) {
        String letra;
        int vocales = 0;
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            letra = (cadena.getFrase().substring(i, i + 1));
            if (letra.equals("a") || letra.equals("A") || letra.equals("e") || letra.equals("E") || letra.equals("i") || letra.equals("I") || letra.equals("o") || letra.equals("O") || letra.equals("u") || letra.equals("U")) {
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales de la frase son: " + vocales);
    }

   public void invertirFrase(Cadena cadena){
       String letra;
       System.out.println("");
       int largo=cadena.getLongitudFrase();
       for (int i = largo ; i > 0; i--) {
           letra = cadena.getFrase().substring(i-1,i);
           System.out.print(letra);
           
       }
   }

    public void vecesRepetidor(Cadena cadena) {
        Scanner leer = new Scanner(System.in);
        String letra;
        int contador = 0;
        System.out.println("Ingrese el caracter a buscar");
        String caracter = leer.next();
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            letra = (cadena.getFrase().substring(i, i + 1));
            if (letra.equals(caracter)) {
                contador++;
            }
        }
        System.out.println("El caracter " + caracter + " se repite " + contador + " veces");
    }

    public void compararLongitud(Cadena cadena) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase a comparar");
        int longitudfrase = (leer.next().length());
        System.out.println("La frase ingresada contiene una longitud de " + longitudfrase);
        System.out.println("La frase inicial contiene una longitud de " + cadena.getLongitudFrase());

    }

    public void unirFrases(Cadena cadena) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase a agregar");
        String frase = leer.nextLine();
        cadena.setFrase(cadena.getFrase() + frase);
        System.out.println(cadena.getFrase());
    }

    public void remplazar(Cadena cadena) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter que desea colocar");
        String letra;
        String caracter = leer.next();
        String fraseoriginal = cadena.getFrase();
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            letra = (cadena.getFrase().substring(i, i + 1));
            if (letra.equals("a")) {
                fraseoriginal.substring(i, i + 1).equals(caracter);
            }else{
                fraseoriginal.substring(i, i + 1).equals(letra);
            }
        }
        cadena.setFrase(caracter);
        System.out.println(cadena.getFrase());
    }

    public void contiene(Cadena cadena) {
        Scanner leer = new Scanner(System.in);
        boolean contiene=false;
        String letrafrase;
        String letraingresada;
        System.out.println("Ingrese una letra");
        letraingresada = leer.next();
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            letrafrase = (cadena.getFrase().substring(i, i + 1));
            if (letrafrase.equals(letraingresada)) {
                contiene = true;
                break;
            } else {
                contiene = false;
            }
        }
        System.out.println("La letra ingresada "+letraingresada+" esta en la frase="+contiene);
    }
    public int menuCadena(int opcion){
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------MENU----------------");
        System.out.println("1-Mostrar vocales");
        System.out.println("2-Invertir Frase");
        System.out.println("3-Cuantas veces se repite un caracter");
        System.out.println("4-Comparar longitud de las frases");
        System.out.println("5-Unir frases");
        System.out.println("6-Remplazar caracter");
        System.out.println("7-Verificar si la frase contiene una letra");
        System.out.println("8-Salir");
        opcion= leer.nextInt();
        return opcion;
    }
}
