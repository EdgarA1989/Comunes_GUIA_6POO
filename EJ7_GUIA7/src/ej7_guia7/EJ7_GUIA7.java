/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7_guia7;
import servicio.servicioPersona;
import entidad.Persona;

/**
 *
 * @author EANDRADA
 */
public class EJ7_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    servicioPersona serviciopersona = new servicioPersona();
    int imc =0;
    boolean edad=false;
     int[] personaIMC = null;
     boolean [] edadpersona=null;
     int debajopesoideal=0;
     int pesoideal=0;
     int sobrepeso=0;
     int mayorDeEdad=0;
     int menorDeEdad=0;
     
     
        Persona persona1 = serviciopersona.crearPersona();
        Persona persona2 = serviciopersona.crearPersona();
        Persona persona3 = serviciopersona.crearPersona();
        Persona persona4 = serviciopersona.crearPersona();
       
        personaIMC[0]= serviciopersona.calcularIMC(persona1, imc);
        personaIMC[1]= serviciopersona.calcularIMC(persona2, imc);
        personaIMC[2]= serviciopersona.calcularIMC(persona3, imc);
        personaIMC[3]= serviciopersona.calcularIMC(persona4, imc);
        
        edadpersona[0] = serviciopersona.esMayorDeEdad(persona1, edad);
        edadpersona[1] = serviciopersona.esMayorDeEdad(persona2, edad);
        edadpersona[2] = serviciopersona.esMayorDeEdad(persona3, edad);
        edadpersona[3] = serviciopersona.esMayorDeEdad(persona4, edad);
        
        for (int i = 0; i < personaIMC.length; i++) {
            switch (personaIMC[i]){
                case -1:
                    debajopesoideal++;
                    break;
                case 0:
                    pesoideal++;
                    break;
                case 1:
                    sobrepeso++;
                    break;
            }
        }
      for (int i = 0; i < edadpersona.length; i++) {
            if (edadpersona[i]==false){
                menorDeEdad++;
            }else
                mayorDeEdad++;
        }   
      
        System.out.println("Con respecto al IMC los resultados son los siguientes:");
        System.out.println("Debajo del peso ideal: "+ debajopesoideal);
        System.out.println("En el peso ideal: "+ pesoideal);
        System.out.println("Con sobrepeso:"+ sobrepeso);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Con respecto a la edad los resultados son los siguientes:");
        System.out.println("Menores a 18 años: "+ menorDeEdad);
        System.out.println("Mayores a 18 años: "+ mayorDeEdad);
    }
    
    
    
}
