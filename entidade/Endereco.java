package br.com.fuctura.projetoescola.entidade;

public class Endereco {
	protected String rua;
	protected Integer numero;
	protected String bairro;
	protected String cidade;
	protected Integer estado;
	
	public Endereco(String rua, Integer numero, String bairro, String cidade, Integer estado) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	public String imprimir() {
		return"[Rua: "+this.getRua()+", "
				+ "Número: "+this.getNumero()+", "
						+ "Bairro: "+this.getBairro()+","
								+ "Cidade: "+this.getCidade()+","
										+ "Estado: "+this.getEstado()+"]";
	}
	

}
