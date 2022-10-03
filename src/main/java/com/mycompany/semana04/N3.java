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
public class N3 {
    public static void main(String[] args) {
double l,r; 
Scanner Teclado =new Scanner (System.in);
System.out.print("Introduce el radio de una circunferencia: ");
r=Teclado.nextDouble();
l=2*Math.PI*r;
System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
}
}
