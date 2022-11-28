package atividade26102022.entities;

public class MaquinaLavarRoupa extends Aparelho{

	private double capacidade = 5.0;
	
	public MaquinaLavarRoupa() {
		this.precoFinal();
	}

	public MaquinaLavarRoupa(double precoBase, double peso) {
		super(precoBase, peso);
		this.precoFinal();
	}

	public MaquinaLavarRoupa(double precoBase, String cor, char consumoEnergia, double peso, double capacidade) {
		super(precoBase, cor, consumoEnergia, peso);
		this.capacidade = capacidade;
		this.precoFinal();
	}
	
	public double getCapacidade() {
		return capacidade;
	}

	/*@Override
	public double precoFinal() {
		super.precoFinal();
		if(this.capacidade>30.0) {
			this.precoBase+=500;
		}
		return this.precoBase;
	}*/
	
	@Override
	protected void precoFinal() {
		this.verificarConsumoEnergia(getConsumoEnergia());
		if(this.capacidade>30.0) {
			this.precoBase+=500;
		}
	}
	
	@Override
	public String toString() {
		return "Maquina de Lavar	|	"
		+ "Preço: R$ " + this.precoBase
		+ "	|	Cor: " + this.cor.toLowerCase()
		+ "	|	Consumo: "+this.getConsumoEnergia()
		+ "	|	Capacidade: "+this.capacidade+"kg";
	}
	
}
