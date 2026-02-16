package com.java.conta;

public class Cofre {

	String extrato = "";
	double dinheiro; 


	Cofre () {

	}

	Cofre ( double valorInicial) {
		dinheiro = valorInicial;
	}


	void guardar (double valor) { 

		if (valor <= 0) {
			System.out.println("Erro. Valor invalido");
			return;
		} 

		dinheiro += valor ;
		extrato += "Guardado: " + valor + "\n"; 
		System.out.println("Valor Guardado com Sucesso");

	}

	boolean temDinheiro (double valor){
		return dinheiro >= valor;

	}


	void retirar (double valor) { 

		if (valor <= 0) {
			System.out.println("Erro. Valor Invalido");
			return;
		}

		if ( temDinheiro(valor)) {
			dinheiro -= valor;
			extrato += "Retirado: " + valor + "\n";
			System.out.println("Valor Retirado com Sucesso");

		} else { 

			System.out.println("Dinheiro Insuficiente");

		}
	}

	void mostrarQuantidade () { 
		System.out.printf("Saldo: R$ %.2f%n", dinheiro);

	}

	void mostrarExtrato () {
		System.out.println("\n === EXTRATO ===");
		System.out.println(extrato);
	}

}

