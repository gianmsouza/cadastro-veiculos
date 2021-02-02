package veiculo;

//Gian Marcel de Souza
public final class Passeio extends Veiculo implements Calc{
	
	private int qtdePassageiros;
	
	public Passeio () {
		qtdePassageiros = 0;
	}
	
	@Override
	public int calcVel(int velocMax) {		
		
		int result = velocMax * 1000; 
		return result;
	}	
	
	public int calcular() {
		int total = getPlaca().length() + getMarca().length() + getModelo().length() + getCor().length();
		return total;		
	}

	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	public final void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}
}
