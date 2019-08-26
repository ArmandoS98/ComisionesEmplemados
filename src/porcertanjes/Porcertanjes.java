/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcertanjes;

import java.util.Scanner;

/**
 *
 * @author asantos
 */
public class Porcertanjes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sueldo_base = 2500.00;
        double comision;
        double sueldo_total;
        double igss = 0.0;
        double isr = 0.0;
        double suma_descuentos = 0.0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese Comisiones perisvidas en el mes -> ");
        comision = input.nextDouble();
        
        sueldo_total =sueldo_base + calcularComisiones(comision) + calcularBonificacion(comision);
        igss = sueldo_total * 0.0454;
        isr = sueldo_total * 0.05;
        suma_descuentos =  igss + isr;
        
        System.out.println("SUELDO BASE: Q."+ sueldo_base);
        System.out.println("TOTAL DE VENTAS: Q." + comision);
        System.out.println("COMISION: Q." + calcularComisiones(comision));
        System.out.println("BONIFICACION: Q." + calcularBonificacion(comision));
        System.out.println("--------------------------------");
        System.out.println("SUELDO BRUTO: Q." + sueldo_total);
        System.out.println("DESCUENTOS");
        System.out.println("IGSS: Q." + igss);
        System.out.println("ISR: Q." + isr);
        System.out.println("--------------------------------");
        System.out.println("TOTAL DESCUENTOS: Q." + suma_descuentos);
        System.out.println("--------------------------------");
        System.out.println("SUELDO NETO: Q." + (sueldo_total - suma_descuentos));
    }

    private static double calcularComisiones(double comision) {
        double valor = 0.0;
        if(comision >= 0.0 && comision <= 100000.0)
            valor = comision * 0.015;
        else if(comision > 100000.00 && comision <=  250000.00)
            valor = comision * 0.0175;
        else if(comision > 250000.00 && comision <= 500000.00)
            valor = comision * 0.02;
        else if(comision > 500000.00)
            valor = comision * 0.0225;
        
        return valor;
    }

    private static double calcularBonificacion(double comision) {
        if(comision > 750000)
            return comision * 0.05;
        else
            return 0.0;
    }
    
}
