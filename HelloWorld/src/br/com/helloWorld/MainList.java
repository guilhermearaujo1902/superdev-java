package br.com.helloWorld;

import java.util.ArrayList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		
		// UMA ALTERAÇÃO PARA TESTE
		// CRIAR UM MENU INTERATIVO COM O USUÁRIO PARA QUE SEJA
		// COM AS SEGUINTES OPÇÕES
		// [1] Exibir lista
		// [2] Novo
		// [3] Remover
		// [4] Alterar
		// [0] Cancelar
		
		// DICA: Utilize a estrutura 'DO..WHILE'
		
		
		// Estrutura de dados LIST
		
		// Declaração da lista
		List<String> listaAlunos = new ArrayList<String>();
		
		
		// Inserir um elemento novo na lista
		listaAlunos.add("Zeka");
		listaAlunos.add("Jão");
		listaAlunos.add("Tio Zé");

		System.out.println("Quantidade de alunos: " + listaAlunos.size());
		
		
		// Imprimir os elementos da lista através do 'FOR'
		System.out.println("*** Impressão com 'FOR' ***");
		for (int i = 0; i < listaAlunos.size(); i++) {
			System.out.println(listaAlunos.get(i));
		}
		
		
		// Imprimir os elementos da lista através do 'FOR..OF'
		System.out.println("*** Impressão com 'FOR..OF' ***");
		for (String aluno : listaAlunos) {
			System.out.println(aluno);
		}
		
		
		// Remover um elemento da lista
		Integer indexRemocao = listaAlunos.indexOf("Zeka");
		if (indexRemocao >= 0) {
			System.out.println("Removendo 'Zeka'");
			listaAlunos.remove(indexRemocao.intValue());
		}
		
		System.out.println("Lista de alunos atualizada: ");
		for (String aluno : listaAlunos) {
			System.out.println(aluno);
		}
		

	}

}
