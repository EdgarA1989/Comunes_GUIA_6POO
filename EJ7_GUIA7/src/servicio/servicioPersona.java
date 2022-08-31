/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Scanner;
import entidad.Persona;
/**
 *
 * @author EANDRADA
 */
public class servicioPersona {
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        String opcion="A";
        Persona personacreada = new Persona();
        System.out.println("Ingrese el nombre de la Persona");
        personacreada.setNombre(leer.nextLine());
        System.out.println("Ingrese la Edad de "+ personacreada.getNombre());
        personacreada.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo de "+ personacreada.getNombre());
        System.out.println("H-Hombre");
        System.out.println("M-Mujer");
        System.out.println("O-Otros");
        while (opcion!=null){
            opcion= leer.next();
            if (opcion =="H" || opcion == "M" || opcion == "O"){
                personacreada.setSexo(opcion);
                break;
            }
        }
        System.out.println("Ingrese la altura de " + personacreada.getNombre());
        personacreada.setAltura(leer.nextDouble());
        System.out.println("Ingrese el peso de "+ personacreada.getNombre());
        personacreada.setPeso(leer.nextDouble());
        return personacreada;
    }
    
    public int calcularIMC(Persona persona, int valorimc){
       double imc = (persona.getPeso()/(persona.getAltura()*persona.getAltura()));
       if (imc < 20){
           valorimc=-1;
       }
       if (imc >= 20 || imc <= 25){
           valorimc=0;
       }
       if (imc > 25){
           valorimc=-1;
       }
       return valorimc;
    }
    
    public boolean esMayorDeEdad(Persona persona, boolean edad){;
        if (persona.getEdad()>=18){
            edad = true;
        }else {
            edad=false;
        }
        return edad;
    }
    
}

