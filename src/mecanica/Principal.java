package mecanica;

public class Principal {

	public static void main(String[] args) {
		Motor m1 = new Motor(500,10,"Gasolina","Manual");
		Carro c1 = new Carro("Fiat",2017,2017,"Verde",0,m1);
		
		System.out.println(c1);

	}

}
