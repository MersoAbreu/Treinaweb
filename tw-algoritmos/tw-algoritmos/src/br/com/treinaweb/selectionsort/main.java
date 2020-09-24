package br.com.treinaweb.selectionsort;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int vetor[]=new int[7];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetor.length;i++) {
			System.out.println("Digite um valor");
			int numero = scan.nextInt();
			vetor[i]=numero;
		}
		System.out.println("VEtor desordenado");
		for(int i =0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("=======================================================");
		System.out.println("\n\n");
		System.out.println("Imprimindo vetor Ordenado");
		//Select Sort
		for(int i=0;i<vetor.length;i++) {
			int indiceMenor = i;
			for( int j=i+1;j<vetor.length;j++) {
				if(vetor[j]<vetor[indiceMenor]) {
					indiceMenor = j;
				}
			}
			int temp = vetor[indiceMenor];
			vetor[indiceMenor]=vetor[i];
			vetor[i]=temp;
		}
		
		System.out.println("=======================================================");
		
		System.out.println("Vetor ordenado ");
		imprimirArray(vetor);
		//############################################################################
		System.out.println("#####################Inicio busca binária################");
		//###Busca Binaria
		
		int resultado = -1;
		int inicio = 0;
		int fim = vetor.length-1;
		int meio = 0;
		System.out.println("Digite o elemento a ser econtrado");
		int alvo = scan.nextInt();
		while(inicio<=fim) {
			meio = (inicio+fim)/2;
			if(vetor[meio]<alvo) {
				inicio = meio+1;
			}else if(vetor[meio]>alvo) {
				fim = meio-1;
			}else if(vetor[meio]==alvo){
				resultado=meio;
				break;
			}
			
		}
		if(resultado<0) {
			System.out.println("Elemento não encontrado");
		}else {
			System.out.println(String.format("O numero %d esta na posição %d ", alvo, resultado));
		}
		
		
		
		
		
		//###Fim Busca binaria
		//############################################################################
		scan.close();
		//Fim Select
	}
	
	private static void imprimirArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
