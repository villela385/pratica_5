package atividade2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class exercicio2 {

	public static void main(String[] args) {
		
			String nome, telefone, instagram, email, pesquisa;
			int i, op=0;
			ArrayList<String> socials = new ArrayList();
			
			Scanner ler = new Scanner(System.in);
			
			do{
				String options = JOptionPane.showInputDialog(null,"Escolha sua opção: \n1 - Cadastrar \n2 - Excluir \n3 - Pesquisar \n4 - Sair" );
				op = Integer.parseInt(options);
				switch(op) {
				
				case 1:
					nome = JOptionPane.showInputDialog(null,"Informe o nome: ");
					telefone = JOptionPane.showInputDialog(null,"Informe o Telefone: ");
					instagram = JOptionPane.showInputDialog(null,"Informe o @ do instagram: ");
					email = JOptionPane.showInputDialog(null,"Informe o email: ");				
					socials.add("Nome: "+nome+"\n Telefone: "+telefone+"\n Instagram: "+instagram+"\n Email: "+email);
					break;
				case 2:
					String n = JOptionPane.showInputDialog(null,"Excluir qual elemento: ");
				    for (i=0; i<socials.size(); i++) {
				    	if(socials.get(i).contains(n) == true) {
				    		try {
							      socials.remove(i);
							    } catch (IndexOutOfBoundsException e) {
							        System.out.printf("\nErro: posição inválida (%s).",
							          e.getMessage());
							    }
				    		JOptionPane.showMessageDialog(null,"Elemento excluido com sucesso!");
				    		
				    	}else if(socials.get(i).contains(n) == false){
				    		JOptionPane.showMessageDialog(null,"Não possui o elemento no Array!");
				    	}else {
				    		JOptionPane.showMessageDialog(null,"Operação invalida!");
				    	}
				    }
					break;
				case 3:
					pesquisa=JOptionPane.showInputDialog(null,"Informe o @ do instagram que deseja pesquisar: ");
				    for (i=0; i<socials.size(); i++) {
				    	if(socials.get(i).contains(pesquisa) == true) {
				    		JOptionPane.showMessageDialog(null," Posição: "+ i+"\n "+ socials.get(i));
				    	}else if(socials.get(i).contains(pesquisa) == false){
				    		JOptionPane.showMessageDialog(null,"Nenhum elemento cadastrado para este @!");
				    	}else {
				    		JOptionPane.showMessageDialog(null,"Operação invalida!");
				    	}		    	
				    }
				    break;
				case 4:
					break;
				}
			} while(op != 4);

		}

	}