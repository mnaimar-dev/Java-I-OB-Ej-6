import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

        public static void main(String[] args) {

            // 1. Escribe el código que devuelva una cadena al revés.
            // Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

                String cadena = "Mensaje de texto";

                int largoCadena = cadena.length();

                String nuevaCadena = "";

                for(int i = largoCadena -1; i >= 0; i--) {
                    nuevaCadena += cadena.charAt(i);
                }

//            System.out.println(nuevaCadena);

            // 2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

                String miArrayDeTexto [] = {"Nicolás", "Hannah", "Ana", "Leandro"};

                for (String nombres : miArrayDeTexto) {
    //                System.out.println(nombres);
                }

            // 3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición
            // y el valor de cada elemento en ambas dimensiones.

                int matrizBidi [][] = new int[2][3];

                matrizBidi[0][0] = 1;
                matrizBidi[0][1] = 2;
                matrizBidi[0][2] = 3;

                matrizBidi[1][0] = 10;
                matrizBidi[1][1] = 20;
                matrizBidi[1][2] = 30;

                for(int i = 0; i < matrizBidi.length; i++) {
                    for(int j = 0; j < matrizBidi[1].length; j++) {
    //                    System.out.println(matrizBidi[i][j]);
                    }
                }

            // 4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
            // Elimina el 2o y 3er elemento y muestra el resultado final.

                Vector<Integer> miVector = new Vector<>();

                miVector.add(20);
                miVector.add(30);
                miVector.add(40);
                miVector.add(50);
                miVector.add(60);

                miVector.remove(1);
                miVector.remove(1);

//            System.out.println(miVector);

            // 5. Indica cuál es el problema de utilizar un Vector con la capacidad
            // por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

                /* El problema es que deberíamos duplicar el vector cada vez que se produce un
                 overflow. Esto consume muchos recursos computacionales por lo que resulta
                 contraproducente. */

            // 6. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
            // Recorre ambos mostrando únicamente el valor de cada elemento.

                ArrayList<String> miArrayList = new ArrayList<>();

                miArrayList.add("iPhone");
                miArrayList.add("iPod");
                miArrayList.add("iPad");
                miArrayList.add("MacBook");

                LinkedList<String> miLinkedList = new LinkedList<>(miArrayList);

                for (int i = 0; i < miArrayList.size(); i++) {
    //                System.out.println(miArrayList.get(i));
                }

                for (int j = 0; j < miLinkedList.size(); j++) {
    //                System.out.println(miLinkedList.get(j));
                }

            // 8. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
            // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
            // Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves,
            // puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

                ArrayList<Integer> miArrayList2 = new ArrayList<>();

                for(int i = 1; i <= 10; i++) {
                    miArrayList2.add(i);
                }

                for(int j = 0; j < miArrayList2.size(); j++) {
                    if(miArrayList2.get(j) % 2 == 0) {
                        miArrayList2.remove(j);
                    }
                }

                for(int numero : miArrayList2) {
//                    System.out.println(numero);
                }

                // 9. Invocación de la función del punto 9.

                try {
                    DividePorCero(2);
                } catch (ArithmeticException e) {
                    System.out.println("No se puede realizar debido al error: " + e.getMessage());
                }

        }
            // 9. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su
            // llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
            // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
            // Finalmente, mostraremos en cualquier caso: "Demo de código".

            public static int DividePorCero(int i){
                return i / 0;
            };

        
    }
