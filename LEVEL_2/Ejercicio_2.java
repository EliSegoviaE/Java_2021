package LEVEL_2;

import java.util.LinkedList;

public class Ejercicio_2 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        LinkedList<Integer> numeros = new LinkedList<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Lista antes de agregar");
        MostrarLista(numeros);
        numeros.addFirst(2);
        numeros.addLast(9);
        System.out.println("Lista despues de agregar");
        MostrarLista(numeros);
    }

    public static void MostrarLista(LinkedList<Integer> listas) {
        for (Integer lista : listas) {
            System.out.println(lista);
        }
    }

}