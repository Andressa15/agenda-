package com.br.zup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SistemaContato {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		int repetir = 1;



		Map<Integer, Contato> listaDeContatos = new HashMap<Integer, Contato>();


		listaDeContatos.put(2, new Contato(2,"Joao", " 09758"));
		listaDeContatos.put(3, new Contato(3,"gabs", "134564"));


		while (repetir == 1) {

			System.out.println(" 1 para criar contato, 2 para deleta o contato, 3 para buscar ");
			int resp = scan.nextInt();
			if (resp == 1) {

				System.out.println("Qual é o nome do contato?");
				String nome = scan.next();

				System.out.println("Qual é o numero?");
				String telefone = scan.next();
				listaDeContatos.put(1, new Contato(1,nome, telefone));
				Contato agenda = new Contato(1,nome, telefone);

			}else if (resp == 2) {
				System.out.println("Digite nome que quer deleta");
				String nomeDelete = scan.next();

				for (Entry<Integer, Contato> delete : listaDeContatos.entrySet()) {
					if ( delete.getValue().getNome().equalsIgnoreCase(nomeDelete)) {
						System.out.println("Nome apagado " );
					}
				}
			}else if (resp == 3) {
				System.out.println(" Digite o nome que quer buscar");
				String busca = scan.next();
				for (Entry<Integer, Contato> contato : listaDeContatos.entrySet()) {
					if (contato.getValue().getNome().equalsIgnoreCase(busca)) {
						System.out.println("Valor encontrado " + contato);
					}else if (!contato.getValue().getNome().equals(busca)) {
						System.out.println(" Nao existe esse nome"); 					
					}
				}
			}
		}
	}
}