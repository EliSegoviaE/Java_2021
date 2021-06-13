package LEVEL_2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_4 {
    public static void main(String[] args) {
        ArrayList<String> ListaEstudiantes = new ArrayList<String>();
        ListaEstudiantes.add("Marta Gómez");
        ListaEstudiantes.add("Alejandro Ruiz");
        ListaEstudiantes.add("Macarena Sanchez");
        ListaEstudiantes.add("Eduardo Moreno");
        ListaEstudiantes.add("Gabriela Diaz");
        ListaEstudiantes.add("Lucas Lopez");
        ListaEstudiantes.add("Franco Delgado");
        ListaEstudiantes.add("Ana Ortega");
        ListaEstudiantes.add("Jorge Serrano");
        ListaEstudiantes.add("Nuria Castro");
        ListaEstudiantes.add("Carlos Santos");
        ListaEstudiantes.add("Alicia Cruz");

        List<String> PrimerCurso = ListaEstudiantes.subList(0, 4);
        List<String> SegundoCurso = ListaEstudiantes.subList(4, 8);
        List<String> TercerCurso = ListaEstudiantes.subList(8, ListaEstudiantes.size());

        System.out.println("Primer Curso");
        for (String estudiante : PrimerCurso) {
            System.out.println(estudiante);
        }

        System.out.println("Segundo Curso");
        for (String estudiante : SegundoCurso) {
            System.out.println(estudiante);
        }

        System.out.println("Tercer Curso ");
        for (String estudiante : TercerCurso) {
            System.out.println(estudiante);
        }
    }

}