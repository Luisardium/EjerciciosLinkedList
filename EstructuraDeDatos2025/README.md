EliminarDuplicados(LinkedList<Integer> lista)
Se utiliza un HashSet<Integer> para almacenar los valores únicos.
Se recorre la LinkedList con un Iterator<Integer>.
Si un número ya existe en el HashSet, se elimina de la lista.

InvertirString(LinkedList<String> lista)
Se recorre la mitad de la LinkedList.
En cada iteración, se intercambian los valores de los extremos (el primer con el último, el segundo con el penúltimo, etc.)
Se usa lista.get(i) y lista.set(i, valor) para modificar los valores en su posición original.


IntercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2)
Se utilizan Iterator<Integer> para recorrer ambas listas.
Se agrega a la nueva lista cada valor empezando por la lista 1
Si se acaban los valores en una lista y quedan en otra, pondra los extra de manera continua

