/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class LibroServicio {
    
   public Libro llenar(){
       Scanner leer = new Scanner(System.in);
       Libro auxiliar = new Libro();
       System.out.println("Ingrese el numero de inventario");
       auxiliar.setISBN(leer.nextInt());
     
       System.out.println("Ingrese el titulo del Libro");
       auxiliar.setTitulo(leer.next());
       leer.nextLine();
       System.out.println("Ingrese el autor del Libro");
       leer.nextLine();
       auxiliar.setAutor(leer.next());
      
       System.out.println("Ingrese la cantidad de Paginas");
       auxiliar.setNpaginas(leer.nextInt());
       return auxiliar;
   }
   public void mostrar(Libro a){
       a.getAutor();
       a.getISBN();
       a.getTitulo();
       a.getNpaginas();
       System.out.println(a);
   }
}
//        this.ISBN = ISBN;
//        this.Titulo = Titulo;
//        this.Autor = Autor;
//        this.Npaginas = Npaginas;