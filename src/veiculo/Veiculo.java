package veiculo;

//Gian Marcel de Souza
public abstract class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int qtdeRodas;
	private int velocMax;
	private Motor motor;
	
	public Veiculo() {
		placa = "";
		marca = "";
		modelo = "";
		velocMax = 0;
		motor = new Motor();
		cor = "";
		qtdeRodas = 0;
	}
	
	public abstract int calcVel(int velocMax);

	public String getPlaca() {
		return placa;
	}

	public final void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public final void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}

	public Motor getMotor() {
		return motor;
	}

	public final void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}
}
