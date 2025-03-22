/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.EjercicioLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.Arrays;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioLinkedList;

/**
 *
 * @author luism
 */
public class EjercicioLinkedListTest {
     @Test
    void testIntercalarListas() {
        LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> lista2 = new LinkedList<>(Arrays.asList(2, 4, 6));

        LinkedList<Integer> resultado = EjercicioLinkedList.IntercalarListas(lista1, lista2);
        
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), resultado, "Error en intercalar listas");
    }
}
