package clases;

import java.util.Scanner;

public class IsnumericNumber {

    public static boolean isNumeric() {
        String value;
        System.out.println("Ingrese numero a convertir");
        Scanner scan =new Scanner(System.in);
        value=scan.nextLine();

        // implementa un bloque try catch aca
        double numero;
        try {
            numero=Double.parseDouble(value);
            System.out.println("Numero covertido"+numero);


        } catch (Exception e) {
            System.out.println("no es un numero es una cadena");

        }

        return false;
    }
}
