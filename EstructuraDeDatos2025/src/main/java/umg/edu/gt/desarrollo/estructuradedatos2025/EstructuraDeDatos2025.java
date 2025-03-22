/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.gt.desarrollo.estructuradedatos2025;

import java.util.Arrays;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioLinkedList;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioVectores;

/**
 *
 * @author wcordova
 */
public class EstructuraDeDatos2025 {
	
	private static final Logger logger = Logger.getLogger(EstructuraDeDatos2025.class);
	

    public static void main(String[] args) {
    	logger.info("Bienvenidos a Programacion 3");
        
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(6);
        lista.add(2);
        lista.add(3);
        lista.add(5);
         System.out.println("Lista antes = " + lista);
        
         EjercicioLinkedList.EliminarDuplicados(lista);
         System.out.println(lista);
         
        LinkedList<String> cadena = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e"));
        System.out.println("Lista original: " + cadena);
        EjercicioLinkedList.InvertirString(cadena);
        System.out.println("Lista invertida: " + cadena);
        
        
        LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1,2,3));
        LinkedList<Integer> lista2 = new LinkedList<>(Arrays.asList(3,4,5,6,7));
        System.out.println("Lista 1 "+ lista1);
        System.out.println("Lista 2 " + lista2);
        
        System.out.println("Lista Intercalada: "+EjercicioLinkedList.IntercalarListas(lista1, lista2));
    }
    

}
