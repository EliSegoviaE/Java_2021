package LEVEL_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio_6 {
    public static void main(String[] args) {
        
        HashSet<Empleado> empleados = new HashSet<>();
        HashMap<Integer, float> sueldo = new HashMap<>();
        
        Empleado Carlos = new Empleado();
        empleados.add(Carlos);

        Empleado Matias = new Empleado();
        empleados.add(Matias);

        Empleado Eduardo = new Empleado();
        empleados.add(Eduardo);

        for (Empleado empleado : empleados) {
            sueldo.put(empleado.dni, empleado.calcular(empleado.horasTrabajadas, empleado.valorPorHora));
        }

        sueldo.forEach((k, v) -> System.out.println("D.N.I.: " + k + " Sueldo: " + v));

    }
}