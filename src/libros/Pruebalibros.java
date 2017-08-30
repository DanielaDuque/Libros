/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import java.util.*;

/**
 *
 * @author ESTUDIANTE
 */
public class Pruebalibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conjuntolibros coleccion = new Conjuntolibros();
        Scanner In= new Scanner (System.in);
        
        
        
        
        int a = 0;
                
         
        while (a!=7){
            System.out.println("Que desea hacer"
                + "\n"
                + "1. Crear y Agregar Libro"
                + "\n"
                + "2.Eliminar por titulo"
                + "\n"
                + "3.Eliminar por autor"
                
                + "\n"
                +  "4.Mostrar de menor a mayor calificacion"
                + "\n"
                   +  "5.Mostrar de mayor a menor calificacion"
                + "\n"
                   +  "6.Mostrar todo"
                + "\n"
                + "7. Salir"
        );
            a= In.nextInt();
        switch (a){
            case 1:
                System.out.println("Titulo");
                    String aa = In.next();
                   System.out.println("Autor");
                    String bb = In.next(); 
                 System.out.println("Paginas");
                    int cc = In.nextInt(); 
                System.out.println("Calificacion");
                    int dd = In.nextInt();
                Libro libro = new Libro (aa,bb,cc,dd);
                coleccion.anadir(libro);
        break;
            case 2:
                System.out.println("Titulo");
                    String aaa = In.next();
           coleccion.eliminartitulo(aaa);
           break;
             case 3:
                System.out.println("Autor");
                    String aaaa = In.next();
           coleccion.eliminartitulo(aaaa);
           break;
             case 4:
                 coleccion.mostrar_menor();
                break;
             case 5:
                 coleccion.mostrar_mayor();
                 break;
             case 6:
                 coleccion.mostrar();
                 break;
                 
             default:
               System.out.println(  "opcion no implementada");
               break;
                 
              
             
        }
        }
        
        
        
        
        
        
        
        
        
        
        
        Libro libro_1 = new Libro ("Alicia en el pais de las marravillas", "Carrol Lewis", 60, 7);
        Libro libro_2 = new Libro ("Rebelion en la granja", "George Orwell", 90, 9);
        Libro libro_3 = new Libro ("El coronel no tiene quien le escriba", "Gabriel Garcia Marquez", 70, 5);
        
        coleccion.anadir (libro_1);
        coleccion.anadir (libro_2);
        
        coleccion.eliminartitulo("Alicia en el pais de las marravillas");
        coleccion.eliminarautor("George Orwell");
        coleccion.anadir (libro_3);
        
        
        coleccion.mostrar();
       
        
        
        
        
    }
    
}
