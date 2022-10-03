/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana04;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class N2 {
    public static void main(String[] args) {
double a,r;
Scanner Teclado =new Scanner (System.in);
System.out.print("Introduce el radio de un circulo: ");
r=Teclado.nextDouble();
a=Math.PI*(r*r);
System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
}
}
