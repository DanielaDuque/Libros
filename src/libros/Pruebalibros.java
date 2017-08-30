/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

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
