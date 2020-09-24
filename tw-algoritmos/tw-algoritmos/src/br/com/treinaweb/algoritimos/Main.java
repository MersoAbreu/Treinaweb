package br.com.treinaweb.algoritimos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//Declaraçao de Array no Java
	//	int [] numeros = new int[4];
		
		
		Scanner scan = new Scanner(System.in);
		
		/*for(int i = 0; i < numeros.length;i++) {
			
			System.out.println("Digite um numero");
			int numero = scan.nextInt();
			numeros[i] = numero;
		}
		for(int i=0;i<numeros.length;i++) {
			
			System.out.println(numeros[i]);
			
		}
		scan.close();
		*/
		String [] pessoas = new String[5];
		
		for(int i=0;i<pessoas.length;i++) {
			System.out.println("Digite um nome");
			String pessoa = scan.next();
			pessoas[i] = pessoa;
		
			
		}
		System.out.println("BUSCA LINEAR");
		System.out.println("Digite o nome a pesquisar ");
		String alvo = scan.next();
		String posicaoResultado = alvo;
		for(int i=0; i<pessoas.length;i++) {
			if(pessoas[i]==alvo) {
				posicaoResultado=pessoas[i];
				break;
			}
		}
		if(posicaoResultado==alvo) {
			System.out.println("Elemento não encontrado");
		}else {
			System.out.println(String.format("A pessoa de nome %s foi enconrado na posicao %s", alvo, posicaoResultado));
		}
		
		System.out.println("Vetor: ");
		imprimirArray(pessoas);
		scan.close();
	}
	private static void imprimirArray(String[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	

}
