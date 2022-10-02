package br.com.fuctura.projetoescola;

import br.com.fuctura.projetoescola.entidade.Aluno;
import br.com.fuctura.projetoescola.entidade.Disciplina;
import br.com.fuctura.projetoescola.entidade.Endereco;
import br.com.fuctura.projetoescola.entidade.Professor;

public class ProjetoEscola {
	public static void main(String[] args) {
		
		
		Endereco endereco1 = new Endereco("Rua Rui Calaca", 94, "Espinheiro","Recife", 02);
		Endereco endereco2 = new Endereco("Rua", 01, "Bairro","Cidade",03);
		Professor professor1 = new Professor("Nildson", "000", endereco2,"java",01);
		Disciplina disciplina1 = new Disciplina("java", 7.0, 7.5, professor1);
		Aluno aluno1 = new Aluno("Vanessa","377", endereco1, "001", disciplina1);
		
		aluno1.imprimir();
		professor1.imprimir();
	}

}
