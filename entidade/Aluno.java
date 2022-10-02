package br.com.fuctura.projetoescola.entidade;

public class Aluno extends Pessoa{

	protected String matricula;
	protected Disciplina disciplina;
	
	
	public Aluno(String nome, String cpf, Endereco endereco, String matricula, Disciplina disciplina) {
		super(nome, cpf, endereco);
		this.matricula = matricula;
		this.disciplina = disciplina;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	@Override
	public void imprimir() {
		System.out.println("---------ALUNO---------");
		System.out.println("Name: "+this.getNome());
		System.out.println("Matrícula: "+this.getMatricula());
		System.out.println("Disciplina: "+this.getDisciplina().toString());
		System.out.println("Cpf: "+this.getCpf());
		System.out.println("Endereço: "+this.getEndereco().imprimir());
		// TODO Auto-generated method stub
		
	}
	
	
}
