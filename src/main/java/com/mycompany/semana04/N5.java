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
public class N5 {
    public static void main(String[] args) {
int num;
Scanner Teclado =new Scanner (System.in);
System.out.print("Introduce un número: ");
num=Teclado.nextInt();
if( num < 0)
System.out.println("Negativo");
else
// suponemos que el 0 es positivo.
System.out.println("Positivo");
}
}
