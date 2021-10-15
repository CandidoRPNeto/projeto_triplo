package motivador.busines;

import java.util.Random;

import motivador.BD.FrasesBancos;

public class Frases {
	
	private Frases() {}
	
	public static String getFraseAleatoria() {
		Random r = new Random();
		return FrasesBancos.getFrase(r.nextInt(5));
	}
}
