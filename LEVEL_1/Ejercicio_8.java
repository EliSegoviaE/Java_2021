package LEVEL_1;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nomyape, edad, dirección, ciudad;

        System.out.println(" Ingrese su nombre ");
        nomyape = teclado.nextLine();
        System.out.println(" Ingrese su edad ");
        edad = teclado.nextLine();
        System.out.println(" Ingrese su dirección ");
        dirección = teclado.nextLine();
        System.out.println(" Ingrese su ciudad ");
        ciudad = teclado.nextLine();
        teclado.close();

        Data data = new Data(nomyape, edad, dirección, ciudad);
        System.out.println(data);

    }
}

class Data {
    String nomyape;
    String edad;
    String dirección;
    String ciudad;

    public Data(String nomyape, String edad, String dirección, String ciudad) {
        this.nomyape = nomyape;
        this.edad = edad;
        this.dirección = dirección;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "{" + this.ciudad + "} - {" + dirección + "} - {" + edad + "} - {" + nomyape + "}";
    }
}