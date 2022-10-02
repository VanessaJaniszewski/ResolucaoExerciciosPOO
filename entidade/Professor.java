package br.com.fuctura.projetoescola.entidade;

public class Professor extends Pessoa{
	
	protected String disciplina;
	protected Integer matricula;
	
	
	public Professor(String nome, String cpf, Endereco endereco, String disciplina, Integer matricula) {
		super(nome, cpf, endereco);
		this.disciplina = disciplina;
		this.matricula = matricula;
	}
	
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}


	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("---------PROFESSOR---------");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Disciplina: "+this.getDisciplina().toString());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("Matricula: "+this.getMatricula());
		System.out.println("Endereço: "+this.getEndereco().imprimir());
		
	}
	
	

}
