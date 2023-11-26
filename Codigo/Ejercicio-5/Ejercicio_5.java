/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.programasdejava;
import java.util.Scanner;

public class nbits {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.print("Ingresa un número binario: ");
        String binarioString = s.nextLine();
        int longt = binarioString.length();
        int decimal = 0;
        int potencia = 0;
        for (int i = longt - 1; i >= 0; i--) {
            int digito = binarioString.charAt(i) - '0';
            decimal += digito * Math.pow(2, potencia);
            potencia++;
        }

        System.out.println("El número binario " + binarioString + " en decimal es: " + decimal);
    }
    }
    

