package projetoRPG;

public class Jogador {
	
	private String nome;
	private String sexo;
	private ClasseJogador classeJogador;
	private String arma;
	private double vidaJogador;
	private double armadura;
	
	public ClasseJogador getClasseJogador() {
		return classeJogador;
	}	
	public void setClasseJogador(ClasseJogador classeJogador) {
		this.classeJogador = classeJogador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public final String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}	
	public Double getVidaJogador() {
		return vidaJogador;
	}
	public void setVidaJogador(double vidaJogador) {
		this.vidaJogador = vidaJogador;
	}
	public Double getArmadura() {
		return armadura;
	}
	public void setArmadura(double armadura) {
		this.armadura = armadura;
	}

}
