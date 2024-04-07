/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorbinario;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ConversorBinario {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

        System.out.print("Ingresa un número binario: ");
        String num = s.nextLine();

        try {
            // Convertir el número binario a decimal
            int dec = Integer.parseInt(num, 2);
            System.out.println("Decimal: " + dec);
            
            // Convertir el número binario a octal
            String oct = Integer.toOctalString(dec);
            System.out.println("Octal: " + oct);
            
            // Convertir el número binario a hexadecimal
            String hexa = Integer.toHexString(dec).toUpperCase();
            System.out.println("Hexadecimal: " + hexa);
        } catch (NumberFormatException e) {
            //en caso de ingresar un numero que no sea binario
            System.out.println("Por favor ingresa un número binario válido.");
        }
    }
}
