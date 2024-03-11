package prjOrdenacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

import br.ashlay.lopes.bubble.MetBubbleSort;
import br.ashlay.lopes.merge.MetMergeSort;

public class Principal {

	public static void main(String[] args) {
		MetBubbleSort met = new MetBubbleSort();
		MetMergeSort met2 = new MetMergeSort();
		

		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Exercicio Ordenação \n 1 - BubbleSort \n 2 - MergeSort"));
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("3Digite o tamanho do vetor que deseja ordenar:"));
		int[] vet = new int[tamanho];
		
		for (int i = 0; i<vet.length; i++) 
		{
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para armazenar no vetor:"));
		}
		switch (opcao) {
			case 1:
				vet = met.bubbleS(vet);
				System.out.println(Arrays.toString(vet));
				break;
			
			case 2:
				vet = met2.mergeS(vet, 0, tamanho-1);
				System.out.println(Arrays.toString(vet));
				break;
				
			default:
				System.out.println("Opção Inválida");
				break;
		}
			
		


	}
	
	

}
