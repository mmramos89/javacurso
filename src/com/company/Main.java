package com.company;

import clases.CapacidadEndedudamiento;
import clases.IsnumericNumber;
import clases.Mensajes;

import javax.swing.*;
import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ingMesuales;
        System.out.println("Ingrese sus ingresos mensuales");
        ingMesuales = in.nextInt();

        int inGastosFijos;
        int inGastosVariable;


        String entrada;
        entrada = JOptionPane.showInputDialog("entrada");


        while (entrada.equals("SI")) {// Esta entrada se pide por ventana
            System.out.println("ingrese sus gastos fijos");
            inGastosFijos = in.nextInt();

            if (inGastosFijos < 0) {
                System.out.println(Mensajes.mensaje1);
            } else {
                System.out.println("Ingrese sus gastos variable");
                inGastosVariable = in.nextInt();
                if (inGastosVariable < 0) {
                    System.out.println(Mensajes.mensaje2);
                    System.out.println(Mensajes.mensaje2_2);

                } else {

                    CapacidadEndedudamiento capacidadEndedudamiento = new CapacidadEndedudamiento();
                    capacidadEndedudamiento.setIngresosTotales(ingMesuales);
                    capacidadEndedudamiento.setGastosFijos(inGastosFijos);
                    capacidadEndedudamiento.setGastoVaribales(inGastosVariable);
                    capacidadEndedudamiento.getCapacidadEndeudamiento();
                    entrada = JOptionPane.showInputDialog("Ingrese Entrada");
                    IsnumericNumber isnumericNumber=new IsnumericNumber();
                    isnumericNumber.isNumeric();

                }


            }





        }





    }



}