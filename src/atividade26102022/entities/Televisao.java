package atividade26102022.entities;

public class Televisao extends Aparelho{
	
	private double resolucao = 20.0;
	private boolean receptorTDT = false;
	
	public Televisao() {
		this.precoFinal();
	}
	
	public Televisao(double precoBase, double peso) {
		super(precoBase, peso);
		this.precoFinal();
	}
	
	public Televisao(double precoBase, String cor, char consumoEnergia, double peso, double resolucao,
			boolean receptorTDT) {
		super(precoBase, cor, consumoEnergia, peso);
		this.resolucao = resolucao;
		this.receptorTDT = receptorTDT;
		this.precoFinal();
	}

	public double getResolucao() {
		return resolucao;
	}

	public void setResolucao(double resolucao) {
		this.resolucao = resolucao;
	}

	public boolean isReceptorTDT() {
		return receptorTDT;
	}

	public void setReceptorTDT(boolean receptorTDT) {
		this.receptorTDT = receptorTDT;
	}
	
	@Override
	public void verificarConsumoEnergia(char consumoEnergia) {
		// TODO Auto-generated method stub
		super.verificarConsumoEnergia(consumoEnergia);
	}
	
	@Override
	protected void precoFinal() {
		this.verificarConsumoEnergia(getConsumoEnergia());
		if(this.resolucao > 40) {
			this.precoBase+=this.precoBase*0.3;
		}if(this.receptorTDT==true) {
			this.precoBase+=500.0;
		}
	}
	
	@Override
	public String toString() {
		String possuiReceptor = null;
		if(this.receptorTDT) {
			possuiReceptor = "sim";
		}else {
			possuiReceptor = "nao";
		}
		return "Televisao		|	"
				+ "Preço: R$ " + this.precoBase
				+ "	|	Cor: " + this.cor.toLowerCase()
				+ "	|	Consumo: "+this.getConsumoEnergia()
				+ "	|	Resolucao: "+this.resolucao + " polegadas"
				+ "	|	Receptor: " + possuiReceptor;
	}
	
}
