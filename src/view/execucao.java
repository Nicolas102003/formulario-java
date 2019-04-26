package view;

import atividade.pessoa;

public class execucao {
	
		public static void main(String[] args) {
			pessoa pessoa = new pessoa();
			pessoa.setNome("Nícolas de Moraes");
			
			System.out.println(pessoa.getNome());
		
			pessoa.setEndereco("Rua Nicolau Campanella");
			System.out.println(pessoa.getEndereco());
		
			pessoa.setBairro("Vila Verde");
			System.out.println(pessoa.getBairro());
			
			pessoa.setCep(7864976);
			System.out.println(pessoa.getCep());
			
			pessoa.setCidade("São Paulo");
			System.out.println(pessoa.getCidade());
			
			pessoa.setEstado("Rua Nicolau Campanella");
			System.out.println(pessoa.getEstado());
			
			
			
			
		
		
		
		}
}
