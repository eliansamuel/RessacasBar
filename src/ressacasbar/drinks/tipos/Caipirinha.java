package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

// A bebida leva cachaça, limão, gelo e açúcar
public class Caipirinha extends Drink{
	
	public Caipirinha() {
		descricao = "Caipirinha";
	}

	@Override
	public double custo() {
		return 15.0;
	}
}
