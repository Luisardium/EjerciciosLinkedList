package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.HashSet;
import java.util.*;


public class EjercicioLinkedList {
	
	/** INSTRUCCIONES
 	Escriba el algoritmo que resuelve el problema en esta clase.
	Debe crear un package llamado umg.edu.gt.test.EjercicioLinkedList que corresponda al Test de esta clase.
	Genere un Test por cada ejemplo y fuerce que uno de esos Test falle, puede implementar retornar un resultado
	y compararlo con el esperado.
	 */
	
	// Usando LinkedList de Java Collections, resuelva los siguientes problemas
	// Problema 1: Dada una LinkedList<Integer>, escribir un método que elimine los valores duplicados, dejando solo la primera aparición de cada número.
	// Problema 2: Implementar un método que invierta los elementos de una LinkedList<String> sin usar otra lista o ArrayList.
	// Problema 3: Dadas dos listas enlazadas ordenadas de enteros, escribir un método que devuelva una nueva LinkedList<Integer> con los elementos de ambas listas intercalados en orden.

    
    public static void EliminarDuplicados(LinkedList<Integer> lista){
        Set<Integer> datos = new HashSet<>();
        Iterator<Integer> Iteracion = lista.iterator();
        while (Iteracion.hasNext()){
            int num = Iteracion.next();
            if(!datos.add(num)){
                Iteracion.remove();
            }
        }
    }
    
    public static void InvertirString(LinkedList<String> lista){
        int izquierda = 0;
        int derecha = lista.size() - 1;

        while (izquierda < derecha) {
            // Intercambiar los elementos en las posiciones 'izquierda' y 'derecha'
            String temp = lista.get(izquierda);
            lista.set(izquierda, lista.get(derecha));
            lista.set(derecha, temp);

            // Mover los índices hacia el centro
            izquierda++;
            derecha--;
        }
    }
    
        public static LinkedList IntercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2){
        LinkedList<Integer> listaIntercalada = new LinkedList<>(); //nueva lista donde se agregaran los datos
        Iterator<Integer> iter1 = lista1.iterator(); //Iteraciones para ambas listas
        Iterator<Integer> iter2 = lista2.iterator();
        
        while (iter1.hasNext() || iter2.hasNext()) { //verifica que almenos uno tenga datos
            if (iter1.hasNext()) {
                listaIntercalada.add(iter1.next());
            }
            if (iter2.hasNext()) {
                listaIntercalada.add(iter2.next());
            }
        }
        
        return listaIntercalada;
        }
}
