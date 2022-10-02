package br.com.fuctura.projetoescola.entidade;

public class Disciplina {
	protected String tipo;
	protected Double nota1;
	protected Double nota2;
	protected Professor professor;

	
	public Disciplina(String tipo, Double nota1, Double nota2, Professor professor) {
		this.tipo = tipo;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.professor = professor;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
		
	

	@Override
	public String toString() {
		return "[tipo=" + tipo + ", nota1=" + nota1 + ""
				+ ", nota2=" + nota2 + ", professor=" + getProfessor().getNome()+"]";
	}
	

}
