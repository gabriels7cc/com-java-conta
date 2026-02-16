package com.java.conta;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) { 

		Scanner sc = new Scanner (System.in); 

		Cofre cofre = new Cofre(); 

		int opcao;


		do {
			System.out.println("\n===== COFRE ====="); 
			System.out.println("1 - Guardar Dinheiro"); 
			System.out.println("2 - Retirar Dinheiro"); 
			System.out.println("3 - Mostrar Saldo"); 
			System.out.println("4 - Mostrar Extrato"); 
			System.out.println("0 - Sair"); 
			System.out.print("Escolha: "); 

			opcao = sc.nextInt(); 

			if (opcao == 1) {

				System.out.println("Valor para guardar: "); 
				double valor = sc.nextDouble(); 
				cofre.guardar(valor); 

			} else if ( opcao == 2 ) {

				System.out.println("Valor para retirar: "); 
				double valor = sc.nextDouble(); 
				cofre.retirar(valor);

			} else if ( opcao == 3 ) {

				cofre.mostrarQuantidade(); 

			} else if ( opcao == 4 ) {

				cofre.mostrarExtrato(); 

			} else if ( opcao != 0 ) {
				System.out.println("Opcao Invalida"); 

			}

		} 	while (opcao != 0); 

		sc.close(); 
		System.out.println("Programa Encerrado"); 
	}
}