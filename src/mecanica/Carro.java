package mecanica;

public class Carro {
	private String marca;
	private int modelo;
	private int anoF;
	private String cor;
	private int km;
	private Motor motor;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public int getAnoF() {
		return anoF;
	}
	public void setAnoF(int anoF) {
		this.anoF = anoF;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
		
	public Carro(String marca, int modelo, int anoF, String cor, int km, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoF = anoF;
		this.cor = cor;
		this.km = km;
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Marca=" + marca + ", Modelo=" + modelo + ", anoF=" + anoF + ", cor=" + cor + ", km=" + km
				+ ", motor=" + motor + "]";
	}
	
	
	
	
	
}
