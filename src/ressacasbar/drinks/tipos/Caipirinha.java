package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

// A bebida leva cacha�a, lim�o, gelo e a��car
public class Caipirinha extends Drink{
	
	public Caipirinha() {
		descricao = "Caipirinha";
	}

	@Override
	public double custo() {
		return 15.0;
	}
}
