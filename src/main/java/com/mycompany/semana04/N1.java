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
public class N1 {
    public static void main(String[] args) {
double a,b,c; 
double x1,x2,d; 
Scanner Teclado =new Scanner (System.in);
System.out.println("Introduzca primer coeficiente (a):");
a=Teclado.nextInt();
System.out.println("Introduzca segundo coeficiente: (b):");
b=Teclado.nextInt();
System.out.println("Introduzca tercer coeficiente: (c):");
c=Teclado.nextInt();
// calculamos el determinante
d=((b*b)-4*a*c);
if(d<0)
System.out.println("No existen soluciones reales");
else{
// queda confirmar que a sea distinto de 0.
// si a=0 nos encontramos una división por cero.
x1=(-b+Math.sqrt(d))/(2*a);
x2=(-b-Math.sqrt(d))/(2*a);
System.out.println("Solución: " + x1);
System.out.println("Solución: " + x2);
}
}
}

