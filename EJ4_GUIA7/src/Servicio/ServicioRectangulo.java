/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class ServicioRectangulo {
    
    public Rectangulo crear(){
        Scanner leer = new Scanner(System.in);
      Rectangulo aux = new Rectangulo();
        System.out.println("Ingrese el valor de la Base del rectangulo");
        aux.setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la altura del rectangulo");
        aux.setAltura(leer.nextInt());
        return aux;
    }
    
    public void perimetro(Rectangulo a){
        int perimetro = (a.getBase() + a.getAltura()) *2;
        System.out.println("El perimetro del Rectangulo es: "+ perimetro);  
    }
    public void superficie(Rectangulo a){
        int superficie = a.getBase() * a.getAltura();
        System.out.println("La superficie del Rectangulo es: "+ superficie);  
    }
    public void mostrar(Rectangulo a){
        System.out.println("");
      //int [][] Matriz1 = new int [a.getAltura()][a.getBase()];
        for (int i = 0; i < a.getAltura() ; i++) {
            for (int j = 0; j < a.getBase(); j++) {
                if (i==0 || i==(a.getAltura()-1) || j==0 || (j==a.getBase()-1)) {
                  System.out.print("* ");  
                } else {
                    System.out.print("  ");
                }
            }
             System.out.println("  ");
        }
    }
}
