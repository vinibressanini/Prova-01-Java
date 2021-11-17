package mecanica;

public class Motor {
	private int potencia;
	private int nChassi;
	private String tComb;
	private String tCamb;
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getnChassi() {
		return nChassi;
	}
	public void setnChassi(int nChassi) {
		this.nChassi = nChassi;
	}
	public String gettComb() {
		return tComb;
	}
	public void settComb(String tComb) {
		this.tComb = tComb;
	}
	public String gettCamb() {
		return tCamb;
	}
	public void settCamb(String tCamb) {
		this.tCamb = tCamb;
	}
	
	
	public Motor(int potencia, int nChassi, String tComb, String tCamb) {
		super();
		this.potencia = potencia;
		this.nChassi = nChassi;
		this.tComb = tComb;
		this.tCamb = tCamb;
	}
	@Override
	public String toString() {
		return " Potencia=" + potencia + ", nChassi=" + nChassi + ", tComb=" + tComb + ", tCamb=" + tCamb + "]";
	}
	
	
	
}
