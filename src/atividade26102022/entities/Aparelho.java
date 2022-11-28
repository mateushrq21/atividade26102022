package atividade26102022.entities;

public class Aparelho {
	
	protected double precoBase = 1000.0;
	protected String cor = "branco";
	private char consumoEnergia = 'F';
	private double peso = 5.0;
	
	public Aparelho() {
		this.precoFinal();
	}
	
	public Aparelho(double precoBase, double peso) {
		this.precoBase = precoBase;
		this.peso = peso;
		this.precoFinal();
	}

	public Aparelho(double precoBase, String cor, char consumoEnergia, double peso) {
		this.precoBase = precoBase;
		this.cor = cor;
		this.consumoEnergia = Character.toUpperCase(consumoEnergia);
		this.peso = peso;
		this.precoFinal();
	}
	
	public void verificarConsumoEnergia(char consumoEnergia) {
		switch(Character.toUpperCase(consumoEnergia)) {
		case 'A':
			this.precoBase+=1000.0;
			break;
		case 'B':
			this.precoBase+=800.0;
			break;
		case 'C':
			this.precoBase+=600.0;
			break;
		case 'D':
			this.precoBase+=500.0;
			break;
		case 'E':
			this.precoBase+=300.0;
			break;
		case 'F':
			this.precoBase+=100.0;
			break;
		default:
			this.consumoEnergia = 'F';
			this.precoBase+=100.0;
			break;
		}
	}
	
	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public char getConsumoEnergia() {
		return consumoEnergia;
	}

	public void setConsumoEnergia(char consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	protected void precoFinal() {
		this.verificarConsumoEnergia(this.consumoEnergia);
	}
	
	@Override
	public String toString() {
		return "Aparelho		|	"
		+ "Preço: R$ " + this.precoBase
		+ "	|	Cor: " + this.cor.toLowerCase()
		+ "	|	Consumo: "+this.getConsumoEnergia();
	}

}
