package veiculo;

//Gian Marcel de Souza
public class Motor {
	
	private int qtdePist;
	private int potencia;
	
	public Motor() {		
		qtdePist = 0;
		potencia = 0;		
	}

	public int getQtdePist() {
		return qtdePist;
	}

	public final void setQtdePist(int qtdePist) {
		this.qtdePist = qtdePist;
	}

	public int getPotencia() {
		return potencia;
	}

	public final void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
