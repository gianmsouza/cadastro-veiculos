package veiculo;

//Gian Marcel de Souza
public final class Carga extends Veiculo implements Calc{
	
	private int tara;
	private int cargMax;
	
	public Carga () {
		tara = 0;
		cargMax = 0;
	}

	@Override
	public int calcVel(int velocMax) {	
		int result = velocMax * 100000; 
		return result;
	}
	
	public int calcular() {
		int total = getQtdeRodas() + getVelocMax() + getMotor().getPotencia() + getMotor().getQtdePist() + getTara() + getCargMax();
		return total;		
	}

	public int getTara() {
		return tara;
	}

	public final void setTara(int tara) {
		this.tara = tara;
	}

	public int getCargMax() {
		return cargMax;
	}

	public final void setCargMax(int cargMax) {
		this.cargMax = cargMax;
	}
}
