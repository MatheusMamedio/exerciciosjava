package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		/*
		 * exercicio 23, faça um programa que leia três numeros e mostre em ordem
		 * decrescente
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com primero numero: ");
		int num1 = scan.nextInt();

		System.out.println("Entre com segundo numero: ");
		int num2 = scan.nextInt();

		System.out.println("Entre com o terceiro numero: ");
		int num3 = scan.nextInt();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			System.out.println(num3 + " - " + num2 + " - " +num1);

		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			System.out.println(num2 + " - " + num3 + " - " + num1);

		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			System.out.println(num3 + " - " + num1  + " - " + num2);

		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			System.out.println(num1 + " - " + num3 + " - " + num2);

		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			System.out.println(num2 + " - " + num1 +  " - " + num3);

		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			System.out.println(num1 + " - " + num2 +  " - " + num3);
		}

	}

}
