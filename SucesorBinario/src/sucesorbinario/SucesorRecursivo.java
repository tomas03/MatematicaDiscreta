/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucesorbinario;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SucesorRecursivo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese la posicion de ese número");
        int pos1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("Ingrese la posicion de ese número");
        int posX = leer.nextInt();

        System.out.println("Ingrese cuantos terminos de la sucesion desea generar");
        int n = leer.nextInt();

        int b, a, m;

        m = posX - pos1;

        int dif = (num2 - num1) / m;

        int nMax = num1 + ((n - 1) * dif);
        int terminos = n;
        //
        System.out.println("Sucesion de izquierda a derecha: ");
        generarSucesionIzqDer(num1, pos1, n, dif);
        System.out.println("Sucesion de derecha a izquierda: ");
        generarSucesionDerIzq(nMax, n, terminos, dif);
    }

    public static void generarSucesionIzqDer(int num, int pos, int n, int dif) {
        if (n <= 0) {
            return;
        }

        int proxNum = num + dif;
        int proxPos = pos + 1;
        System.out.print(num + " ");
        generarSucesionIzqDer(proxNum, proxPos, n - 1, dif);
    }

    //nMax=40    n=10 term=10   dif=4
    public static void generarSucesionDerIzq(int num, int n, int pos, int dif) {
        if (pos <= 0) {
            return;
        }

        int proxNum = num - dif;
        int proxPos = pos - 1;
        System.out.print(num + " ");
        generarSucesionDerIzq(proxNum, proxPos, n - 1, dif);
    }
}
